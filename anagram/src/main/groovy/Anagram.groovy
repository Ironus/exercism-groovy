class Anagram {

    def subject
    def sorted

    def Anagram(subject) {
        this.subject = subject.toLowerCase()
    }

    def find(candidates) {
        sorted = subject.toList().sort()

        candidates.findAll{
            (it.toLowerCase() != subject) && (it.toLowerCase().toList().sort() == sorted) 
        }
    }
}