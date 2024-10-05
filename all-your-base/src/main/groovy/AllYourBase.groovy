class AllYourBase {

    def inBase10 = 0

    AllYourBase(inputBase, digits) {
        if (inputBase < 2) throw new ArithmeticException()

        digits.reverse(true)

        for (int i = digits.size() -1; i >= 0; i--) {
            def digit = digits[i]

            if (digit < 0 || digit >= inputBase) throw new ArithmeticException()

            inBase10 += digit * (inputBase**i)
        }
    }

    def rebase(outputBase) {
        if (outputBase < 2) throw new ArithmeticException()

        if (inBase10 == 0) return [0]

        def converted = []

        while (inBase10) {
            converted << inBase10 % outputBase
            inBase10 = inBase10.intdiv(outputBase)
        }

        converted.reverse()
    }
}