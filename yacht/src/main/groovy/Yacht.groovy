class Yacht {

    def static categories = ['ones' : { sumVal(it, 1) },
                             'twos' : { sumVal(it, 2) },
                             'threes' : { sumVal(it, 3) },
                             'fours' : { sumVal(it, 4) },
                             'fives' : {sumVal(it, 5) },
                             'sixes' : { sumVal(it, 6) },
                             'full house' : { fullHouse(it) },
                             'four of a kind' : { fourOfAKind(it) },
                             'little straight' : { it.containsAll([1,2,3,4,5]) ? 30 : 0 },
                             'big straight' : { it.containsAll([2,3,4,5,6]) ? 30 : 0 },
                             'choice' : { it.sum() },
                             'yacht' : { (it.toUnique().size() == 1) ? 50 : 0 }]

    static Integer score(List<Integer> dice, String category) {
        categories[category](dice)
    }

    static sumVal(List<Integer> dice, int valueToSum) {
        dice.count(valueToSum) * valueToSum
    }

    static fullHouse(List<Integer> dice) {
        (dice.countBy{ it }.values().sort() == [2,3]) ? dice.sum() : 0
    }

    static fourOfAKind(List<Integer> dice) {
        dice.countBy{ it }.findResults{ k, v -> (v == 4 || v == 5) ? k * 4 : 0 }.sum()
    }
}

