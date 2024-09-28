class WordCount {

    final String s

    WordCount(s) {
        this.s = s.toLowerCase()
    }

    def countWords() {
        def matcher = s =~ $/(?>\w+'?\w{1,2})|\w/$

        matcher.inject([:].withDefault{ 0 }){ 
            map, word -> map << [(word): map[(word)] + 1]
        } 
    }
}