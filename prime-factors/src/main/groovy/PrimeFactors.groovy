class PrimeFactors {
    static def primes = [2]

    static isPrime(value) {
        if (value == 1) return false
        if (value == 3) return true
        if (value % 2 == 0 || value % 3 == 0) return false

        for (int i = 5; i * i <= value; i = i + 6) {
            if (value % i == 0 || value % (i + 2) == 0) return false
        }

        true
    }

    static calcNextPrime() {
        def next = primes.last()
        next += (next == 2) ? 1 : 2

        while (!isPrime(next)) {
            next += 2
        }

        primes << next
    }

    static factors(value) {
        def factors = []
        def index = 0

        while (value != 1 && !isPrime(value)) {
            if (value % primes[index] == 0) {
            	value = value.intdiv(primes[index])
                factors << primes[index]
                index = 0
            } else {
                if (primes.size() == index + 1)
                    calcNextPrime()

                index++
            }
        }

        if (isPrime(value))
            factors << value

        factors
    }
}