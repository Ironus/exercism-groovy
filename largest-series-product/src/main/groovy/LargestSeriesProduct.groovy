class LargestSeriesProduct {
    static largestProduct(digits, span) {
        if (span > digits.size())
            throw new IllegalArgumentException("span must be smaller than string length")
        if (digits && !digits.isBigInteger())
            throw new IllegalArgumentException("digits input must only contain digits")
        if (span < 0)
            throw new IllegalArgumentException("span must not be negative")
        if (span == 0)
            return 1

        digits.collect{ it.toBigDecimal() }.collate(span, 1, false).collect{
            it.inject(1){ acc, val -> acc * val }
        }.max()
    }
}
