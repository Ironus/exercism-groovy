class SaddlePoints {

    static getSaddlePoints(matrix) {
        def candidates = []

        matrix.eachWithIndex{ row, ridx ->
            def max = row.max()

            row.eachWithIndex{ val, cidx ->
                def min = matrix.collect{ it[cidx] }.min()
                
                if (min == max && val == min) {
                    candidates << [ridx, cidx]
                }
            }
        }

        candidates
    }
}