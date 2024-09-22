class Acronym {

    static String abbreviate(String phrase) {
        phrase.replaceAll(/(?<!_)\B[\p{L}']+|[\s-,_]/, '').toUpperCase()
    }

}