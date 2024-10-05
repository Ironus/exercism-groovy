class SquareRoot {

    static Integer squareRoot(Integer radicand) {
        def f = { it -> 0.5 * (it + radicand / it) }

        def root = radicand / 2
        
        while (root * root != radicand) {
            root = f.call(root)
        }

        root
    }

}
