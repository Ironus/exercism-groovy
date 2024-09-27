class RnaTranscription {

    def static complements = [ G : 'C', C : 'G', T : 'A', A : 'U' ]

    static String toRna(String strand) {
        def result = ''

        strand.each{ nucleotide -> result += complements[(nucleotide)] }

        result
    }
}
