package abstractFactory

interface CharacterFactory {
    fun createWarrior(): Warrior
    fun createWizard(): Wizard
    fun createArcher(): Archer
}