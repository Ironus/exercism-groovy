class ProteinTranslation {

    static codon2protein = [
        AUG : 'Methionine',
        UUU : 'Phenylalanine', UUC : 'Phenylalanine',
        UUA : 'Leucine', UUG : 'Leucine',
        UCU : 'Serine', UCC : 'Serine', UCA : 'Serine', UCG	: 'Serine',
        UAU : 'Tyrosine', UAC : 'Tyrosine',
        UGU : 'Cysteine', UGC : 'Cysteine',
        UGG	: 'Tryptophan' ]

    static proteins(strand) {
        def result = []

        if (strand ==~ $/^(UAA|UAG|UGA).*/$) return result

        def noSTOPsMatcher = strand =~ $/\w+(?=UAA|UAG|UGA)/$
        def noSTOPs = noSTOPsMatcher.getCount() > 0 ? noSTOPsMatcher.getAt(0) : strand
        def codonMatcher = noSTOPs =~ $/\w{3}/$

		codonMatcher.each{ codon -> if (codon2protein.containsKey(codon)) 
                                        result << codon2protein[(codon)] }

        return result
    }
}