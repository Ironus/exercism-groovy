class Proverb {

    static recite(strings) {
        StringBuilder sb = new StringBuilder()

        strings.eachWithIndex{ it, idx ->
            if (idx + 1 == strings.size()) {
                sb.append("And all for the want of a ${strings[0]}.")
            } else {
                sb.append("For want of a ${it} the ${strings[idx + 1]} was lost.\n")
            }
        }

        sb.toString()
    }
}