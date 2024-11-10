class SumOfMultiples {

    static int sum(List<Integer> factors, int limit) {
        Set<Integer> multiples = []

        factors.each{
            if (it == 0)
                multiples << 0
            else {
                Integer value = it

                while(value < limit) {
                    multiples << value
                    value += it
                }
            }
        }

        multiples.sum() ?: 0
    }
}