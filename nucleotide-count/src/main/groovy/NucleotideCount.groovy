class NucleotideCount {

    static count(strand) {
        def result = ['A' : 0, 'C' : 0, 'G' : 0, 'T' : 0]
        
        if (strand =~ $/[^ACGT]/$)
            throw new Exception()
        
        strand.each{ result[it] += 1 }

        result
    }
}