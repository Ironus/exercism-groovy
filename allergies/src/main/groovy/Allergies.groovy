class Allergies {

    def substances = ['eggs', 'peanuts', 'shellfish', 'strawberries',
                      'tomatoes', 'chocolate', 'pollen', 'cats']

    def allergies = []

    Allergies(int score) {
        substances.eachWithIndex{ it, idx -> 
            if (score & (2**idx))
                allergies << it
        }
    }

    def allergicTo(substance) {
        allergies.contains(substance)
    }

    def list() {
        allergies
    }
}