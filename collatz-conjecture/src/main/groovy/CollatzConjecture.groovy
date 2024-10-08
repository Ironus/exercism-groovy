class CollatzConjecture {
    static int steps(int number) {
        if (number < 1) throw new ArithmeticException()
        if (number == 1) return 0
        
        1 + steps((number%2 == 0) ? number.intdiv(2) : 3*number+1)
    }
}