class MatchingBrackets {
    static def pairs = [')' : '(', ']' : '[', '}' : '{']

    static isPaired(value) {
        def brackets = []

        value = value.replaceAll(~/[^()\[\]{}]/, '')

        if (value.size() % 2 == 1) return false
        
        value.each{
            // is opening bracket 
            if (!pairs.containsKey(it))
                brackets << it
            // is closing bracket
            else if (!brackets.isEmpty() && brackets.last() == pairs[(it)])
                brackets.removeLast()
            else return false
        }

        brackets.isEmpty()
    }
}