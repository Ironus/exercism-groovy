class ResistorColorDuo {

    def static colors = [black : 0,
                         brown : 1,
                         red : 2,
                         orange : 3,
                         yellow : 4,
                         green : 5,
                         blue : 6,
                         violet : 7,
                         grey : 8,
                         white : 9]

    static int value(List<String> colorsInput) {
        colors[(colorsInput[0])] * 10 + colors[(colorsInput[1])]
    }
}