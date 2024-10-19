class NthPrime {
    /* Eratosthenes' sieve 
       Ref: https://exercism.org/tracks/groovy/exercises/sieve/solutions/menketechnologies 
       Hate to admit, but menketechnologies' solution is much nicer than mine ;) */
    static def sieve(int limit) {
        def numbers = (2..limit).toList()
        def res = []

        while (!numbers.isEmpty()) {
            def head = numbers.get(0)
            res.add(head)
            numbers.removeIf {it % head == 0 }
        }

        res
    }

    /* 2010 Dussart's upperbound */
    static int upperBound(int x) {
        2 + Math.floor(1.2 * x * Math.log(x))
    }

    static nth(int n) {
        if (n <= 0) throw new ArithmeticException()

        def upper = upperBound(n + 1)
        
        sieve(upper)[n-1]
    }

}