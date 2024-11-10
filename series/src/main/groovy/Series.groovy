class Series {

    static slices(series, sliceLength) {
        if (!series || sliceLength < 1 || sliceLength > series.size())
            throw new ArithmeticException()

        def substrings = []
        def start = 0

        while (start + sliceLength <= series.size()) {
            substrings << series.substring(start, start + sliceLength)
            start++
        }

        substrings
    }
}