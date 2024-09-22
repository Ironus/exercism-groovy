class DifferenceOfSquares {
    long num

    DifferenceOfSquares(num) {
        this.num = num
    }

    def squareOfSum() {
        (((1 + num) / 2) * num)**2
    }

    def sumOfSquares() {
        num*(num + 1)*(2*num + 1)/6
    }

    def difference() {
        squareOfSum() - sumOfSquares()
    }

}
