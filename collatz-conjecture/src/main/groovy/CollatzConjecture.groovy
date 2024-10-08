class CollatzConjecture {
    static int steps(int number) {
        if (number < 1) throw new ArithmeticException()
        
        def counter = 0
        
        while (number != 1) {
            counter++
            number = (number % 2 == 0) ? number.intdiv(2) : number*3+1
        }

        counter
    }
}