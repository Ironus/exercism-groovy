class Darts {

    static int score(x, y) {
		switch (x**2 + y**2) {
			case { it <= 1 }: return 10
			case { it <= 25 }: return 5
			case { it <= 100 }: return 1
			default: return 0
		}
    }
}