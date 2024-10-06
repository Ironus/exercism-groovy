class Allergies {

    def substances = ['eggs', 'peanuts', 'shellfish', 'strawberries',
                      'tomatoes', 'chocolate', 'pollen', 'cats']

    def score

    Allergies(int score) {
        this.score = score
    }

    def allergicTo(substance) {
        (score & (1 << substances.findIndexOf{ it == substance })) != 0
    }

    def list() {
        substances.findAll{ allergicTo(it) }
    }
}