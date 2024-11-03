/** Kudos to gilesejb - just beautiful
    https://exercism.org/tracks/groovy/exercises/roman-numerals/solutions/gilesejb
 **/
class RomanNumerals {
    static final romans = [ [1000, 'M'],
                            [900, 'CM'],
                            [500, 'D'],
                            [400, 'CD'],
                            [100, 'C'],
                            [90, 'XC'],
                            [50, 'L'],
                            [40, 'XL'],
                            [10, 'X'],
                            [9, 'IX'],
                            [5, 'V'],
                            [4, 'IV'],
                            [1, 'I'] ]

    RomanNumerals() {
        Integer.metaClass.getRoman = { ->
            def num = delegate as int
            def result = ''
            while (num > 0) {
                def (romanInt, romanStr) = romans.find { roman ->
                    num >= roman[0]
                }
                num = num - romanInt
                result = "$result$romanStr"
            }
            return result
        }
    }
}
