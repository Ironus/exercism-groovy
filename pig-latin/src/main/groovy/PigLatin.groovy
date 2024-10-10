class PigLatin {

    static String translate(String phrase) {
        def translated = []

        def vowels = ~"^([aeiou]|xr|yt).*"
        def consonants = ~"^([^aeiou]+(?=y)|[^aeiou]?qu|[^aeiou]+)([a-z]+)"

        phrase.split(' ').each {
            translated << ((it ==~ vowels) ? it : it.replaceAll(consonants) { 
                match, consonant, rest -> rest + consonant }) + 'ay'
        }
        
        translated.join(' ')
    }

}
