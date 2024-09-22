class Hamming {

    def distance(strand1, strand2) {
        if (strand1.length() != strand2.length())
            throw new ArithmeticException()

        def distance = 0;

        strand1.eachWithIndex { letter, idx -> { 
            if (letter != strand2[idx]) 
                distance++;
            }
        }

        return distance
    }

}