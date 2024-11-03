class RunLengthEncoding {

    static encode(input) {
        if (input == '')
            return input

        def output = ''
        def current = ''
        def counter = 0
        
        input.each {
            if (current == '')
                current = it
            
            if (current != it) {
                output += "${((counter == 1) ? '' : counter)}${current}"
                counter = 1
                current = it
            } else {
                counter++
            }
        }

		output += "${((counter == 1) ? '' : counter)}${current}"
    }

    static decode(input) {
        def output = ''
        def matcher = input =~ $/(\d*)(\D)/$

        matcher.each{
            def character = it[2]
            def length = (it[1] == '' ? 1 : it[1].toInteger())

            output += character * length
        }

        output
    }
}