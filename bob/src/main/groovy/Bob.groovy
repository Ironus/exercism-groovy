class Bob {
    static response(input) {
        switch (input) {
            case ~/[^a-z]*[A-Z][^a-z]+\?/: return "Calm down, I know what I'm doing!"
            case ~/.+\?\s*/: return "Sure."
            case ~/[^a-z]*[A-Z][^a-z]+!?/: return "Whoa, chill out!"
            case ~/^\s*/: return "Fine. Be that way!"
            default: return "Whatever."
        }
    }
}