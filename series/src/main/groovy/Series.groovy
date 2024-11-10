class Series {

    static slices(series, sliceLength) {
        if (!series || sliceLength < 1 || sliceLength > series.size())
            throw new ArithmeticException()

        series.collect().collate(sliceLength, 1, false).collect{ it.join('') }
    }
}