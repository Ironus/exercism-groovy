class PerfectNumbers {

    static Set<Integer> getFactors(int num) {
        Set<Integer> factors = [1]

        for (int i in 2..Math.ceil(Math.sqrt(num))) {
            if (num % i == 0) { 
                factors << i
                factors << num.intdiv(i)
            }
        }

        factors
    }

    static Classification classify(int num) {
        if (num < 1) throw new ArithmeticException()
        if (num < 3) return Classification.DEFICIENT

        switch(getFactors(num).sum()) {
            case { it == num }: return Classification.PERFECT
            case { it > num }: return Classification.ABUNDANT
            default: return Classification.DEFICIENT
        }
    }
}