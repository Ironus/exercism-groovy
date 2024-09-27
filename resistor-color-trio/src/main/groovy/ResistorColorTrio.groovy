class ResistorColorTrio {
    def static colors = [black : 0,
                         brown : 1,
                         red : 2,
                         orange : 3,
                         yellow : 4,
                         green : 5,
                         blue : 6,
                         violet : 7,
                         grey : 8,
                         white : 9]

    def static prefix = [(9) : ' giga',
                         (6) : ' mega',
                         (3) : ' kilo']

    static String label(List<String> colorsInput) {
        def tens = colors[colorsInput[0]] * 10
        def singles = colors[colorsInput[1]]
        def exponent = colors[colorsInput[2]]

        def value = (tens + singles) * 10**(exponent)
        def zeroes = value.toString().count('0')

        String prefixVal

        while (zeroes >= 3) {
            prefixVal = prefix[zeroes] ?: ''
            
            if (prefixVal) {
                value /= 10**(zeroes)
                zeroes = 0
            } else {
                zeroes--
            }
        }

        "${ value }${ prefixVal ?: ' ' }ohms"

    }

}