class HighScores {
    ArrayList scores

    HighScores(ArrayList scores) {
        this.scores = scores
    }

    def latest() {
        scores.last()
    }

    def personalBest() {
        def best = scores.first()

        scores.each{ it -> if (it > best) best = it }

        return best
    }

    def personalTopThree() {
        scores.sort(false).reverse().take(3);
    }
}