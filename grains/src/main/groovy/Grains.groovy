class Grains {
    static square(num) {
        if (num < 1 || num > 64) throw new ArithmeticException()
        2**(num-1)
    }

    static total() {
        /* geometric sum (a1 * (1-q^n)/(1-q)) + 1 starting grain 
           (since formula works for n>0) */
        2**64 - 1
    }
}
