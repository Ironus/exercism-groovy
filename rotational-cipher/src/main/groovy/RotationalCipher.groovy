class RotationalCipher {
    static final ALPHABET = 'a'..'z'

    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    String rotate(String cipherText) {
        cipherText.collectReplacements{ letter -> 
            def isUpperCase = letter.toCharacter().isUpperCase()
            if (isUpperCase)
                letter = letter.toLowerCase()

            if (!ALPHABET.contains(letter))
                return null

            def oldIndex = ALPHABET.findIndexOf{ it == letter }
            def newLetter = ALPHABET[(oldIndex + key) % ALPHABET.size()]

            if (isUpperCase) 
                newLetter = newLetter.toUpperCase()

            newLetter
        }
    }
}
