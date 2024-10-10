class IsbnVerifier {
    static boolean isValid(String isbn) {
        isbn = isbn.replaceAll('[^0-9X]', '')

        if (isbn.size() != 10 || !(isbn ==~ /^[0-9]*X?$/)) return false

        def sum = (10..1).collect {
            def val = ((isbn[10-it] != 'X') ? isbn[10-it] : '10')
        	val.toInteger() * it
        }.sum() % 11 == 0
    }
}