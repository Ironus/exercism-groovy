class PascalsTriangle {

    static rows(count) {
        def triangle = []
        
        for (int i = 0; i < count; i++) {
        	def row = []
        	
        	for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
        			row << 1
        		} else {
        			row << triangle[i - 1][j - 1] + triangle[i - 1][j]
        		}
        	}
        	
        	triangle << row
        }
        
        triangle
    }
}
