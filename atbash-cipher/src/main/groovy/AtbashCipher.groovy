class AtbashCipher {
    static final def alphabet = ['a'..'z'].flatten()

    static String encode(phrase) {
        phrase
            .toLowerCase()
            .replaceAll($/\W/$, '')
            .collect(
                c -> alphabet[25 - alphabet.findIndexOf{ it == c }] ?: c)
            .collate(5)
            .collect{c -> c.join()}
            .join(' ')
    }

    static String decode(phrase) {
        encode(phrase).replaceAll(' ', '')
    }

}