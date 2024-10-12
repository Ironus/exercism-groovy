class Luhn {

    static boolean valid(String value) {
        value = value.replaceAll(' ', '')

        // contains anything that is not a digit
        if (value ==~ ~/.*[^\d]+.*/) return false
        if (value.size() < 2) return false

        def digits = value.collect(new ArrayList()){ it.toInteger() }

        for (int i = (digits.size()-2); i>= 0; i -= 2) {
            digits[i] = (digits[i] * 2)
            if(digits[i] > 9) digits[i] -= 9
        }

        digits.sum() % 10 == 0
    }

}
