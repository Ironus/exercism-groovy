class EliudsEggs {

    static eggCount(number) {
        def counter = 0

        while (number) {
            counter += (number & 1)
            number >>= 1
        }

        counter
    }

}
