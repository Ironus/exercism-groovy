class ArmstrongNumber {
    static digitAtIndex(number, index) {
        (number.intdiv(10.power(index))) % 10
    }

    static isArmstrongNumber(number) {
        def length = Math.ceil(Math.log10(number))
        int calculated = 0

        for (int i = 0; i < length; i++) {
            calculated += digitAtIndex(number, i).power(length)
        }

        return number == calculated
    }

}