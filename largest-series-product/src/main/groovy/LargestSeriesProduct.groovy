class LargestSeriesProduct {
    static largestProduct(digits, span) {
        if ((!digits && span != 0) || span > digits.size())
            throw new IllegalArgumentException("span must be smaller than string length")
        if (digits && !digits.isBigInteger())
            throw new IllegalArgumentException("digits input must only contain digits")
        if (span < 0)
            throw new IllegalArgumentException("span must not be negative")
        if (span == 0)
            return 1

        def product = 0

        digits.collect().collate(span, 1, false).collect{ it.join('') }.each{
            def newProduct = 1
            it.each{ newProduct *= it.toBigDecimal() }

            if (newProduct > product)
                product = newProduct
        }

        product
    }
}
