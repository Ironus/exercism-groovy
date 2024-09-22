class Pangram {

    static boolean isPangram(String sentence) {
        Set<String> letters = 
            ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
             "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"]

        sentence.each{ letter -> letters.removeElement(letter.toUpperCase()) }

        letters.isEmpty()
    }

}