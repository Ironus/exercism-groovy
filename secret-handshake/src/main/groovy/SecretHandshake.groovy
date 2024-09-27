class SecretHandshake {

    static List<String> commands(int number) {
        def actions = []

        if (number & 1) actions << 'wink'
        if (number & 2) actions << 'double blink'
        if (number & 4) actions << 'close your eyes'
        if (number & 8) actions << 'jump'
        if (number & 16) actions.reverse(true)

        actions
    }
}
