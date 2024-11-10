class Triangle {

    def a, b, c
    def isTriangle

    Triangle(a, b, c) {
        this.a = a
        this.b = b
        this.c = c
    }

    boolean isTriangle() {
        a != 0 && b != 0 && c != 0 && (a + b) > c && (a + c) > b && (b + c) > a
    }

    boolean isEquilateral() {
        isTriangle() && a == b && b == c
    }

    boolean isIsosceles() {
        isTriangle() && (a == b || a == c || b == c)
    }

    boolean isScalene() {
        isTriangle() && a != b && a != c && b != c
    }

}
