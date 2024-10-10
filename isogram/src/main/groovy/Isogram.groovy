class Isogram {
    static boolean isIsogram(String phrase) {
        def lettersOnly = phrase.toLowerCase().findAll(/[a-z]/)
        lettersOnly.toSet().size() == lettersOnly.size()
    }
}