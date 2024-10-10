class Isogram {
    static boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll(/[ -]/, '')
        phrase.collect(new HashSet()){ it.toLowerCase() }.size() == phrase.size()
    }
}