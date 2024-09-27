import java.util.concurrent.*

class RobotName {
    def static final Alphabet = 'A'..'Z'

    String name

    RobotName() {
        reset()
    }

    def reset() {
        def firstLetter = Alphabet[ThreadLocalRandom.current().nextInt(26)]
        def secondLetter = Alphabet[ThreadLocalRandom.current().nextInt(26)]
        def number = ThreadLocalRandom.current().nextInt(100,1000)
        
        name = "${firstLetter}${secondLetter}${number}"
    }
}
