class PigLatin {

    static String translate(String phrase) {
        def translated = []

        phrase.split(' ').each {
            String word
            
            if (it ==~ ~/^(?>a|e|i|o|u|xr|yt).*$/) {
                word = it
            } else if (it ==~ ~/.*qu.*/) {
                word = it.find(~/qu.*/) - 'qu' + it.find(~/.*qu/)
            } else if (it ==~ ~/[^(?>a|e|i|o|u)]+y.*/) {
                word = it.find(~/y.*/) + (it.find(~/.*y/) - 'y')
            } else {
                word = it.find(~/(?=[aeiou]).*/)
                word += (it - word)
            }
            
            translated << (word + 'ay')
        }
        
        translated.join(' ')
    }

}
