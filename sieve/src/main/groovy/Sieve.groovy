class Sieve {

    static primes(Integer limit) {
        if (limit < 2) return []

        Set sieve = 2..limit

        for (int i = 0; i < sieve.size(); i++) {
            int current = sieve[i] * 2

            while(current <= limit) {
                sieve -= current
                current += sieve[i]
            }
        }

        return (sieve as List)
    }

}
