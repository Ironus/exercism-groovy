class Matrix {
    int rowSize = 0
    def matrix = []

    Matrix(String asString) {
        asString.eachLine{ line ->
            def values = line.split(' ')
            rowSize = values.size()
            values.each{ value -> matrix << value.toInteger() }
        }
    }

    int[] row(int rowNumber) {
        def row = []

        def start = rowNumber * rowSize
        
        for (int i = start; i < start + rowSize; i++) {
            row << matrix[i]
        }

        row
    }

    int[] column(int columnNumber) {
        def column = []

        while (columnNumber < matrix.size()) {
            column << matrix[columnNumber]
            columnNumber += rowSize
        }

        column
    }
}
