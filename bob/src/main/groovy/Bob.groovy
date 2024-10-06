class Bob {
    static response(input) {
        input = input.grep(~/\D/).join().trim()

        def question = (!input.isEmpty() && input.collect().last() == '?')
        def shouting = (input == input.toUpperCase() && input =~ /\w+/)
        def silence = (input.isEmpty() || input.isAllWhitespace())
        
        if (question && shouting) return /Calm down, I know what I'm doing!/
        else if (question) return 'Sure.'
        else if (shouting) return 'Whoa, chill out!'
        else if (silence) return 'Fine. Be that way!'
        else return 'Whatever.'
    }
}