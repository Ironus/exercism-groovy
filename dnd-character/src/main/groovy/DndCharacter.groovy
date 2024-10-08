import java.util.concurrent.*

class DndCharacter {
    def strength, dexterity, constitution, intelligence, wisdom, charisma
    def modifier
    def hitpoints

    def modifier(constitution) {
        Math.floor((constitution - 10) / 2)
    }

    def ability() {
        (0..3).collect{ ThreadLocalRandom.current().nextInt(6) + 1 }
              .toSorted()
              .tail()
              .sum()
    }

    DndCharacter() {
        strength = ability()
        dexterity = ability()
        constitution = ability()
        intelligence = ability()
        wisdom = ability()
        charisma = ability()

        modifier = modifier(constitution)
        hitpoints = 10 + modifier
    }
}
