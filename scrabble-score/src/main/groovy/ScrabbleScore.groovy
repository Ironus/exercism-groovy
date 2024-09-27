class ScrabbleScore {

    static getLetterPoints(String letter) {
        switch(letter) {
            case { it in ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T'] }: 
                return 1
            case { it in ['D', 'G'] }:
                return 2
            case { it in ['B', 'C', 'M', 'P'] }:
                return 3
            case { it in ['F', 'H', 'V', 'W', 'Y'] }:
                return 4
            case { it in 'K' }:
                return 5
            case { it in ['J', 'X'] }:
                return 8
            case { it in ['Q', 'Z'] }:
                return 10
        }
    }

    static scoreWord(String word) {
        if (!word)
            return 0

        word.toUpperCase().collect{ letter -> getLetterPoints(letter) }.sum()
    }

}
