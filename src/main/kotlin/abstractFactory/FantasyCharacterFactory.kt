package abstractFactory

class FantasyCharacterFactory : CharacterFactory {
    override fun createWarrior() = FantasyWarrior()
    override fun createWizard() = FantasyWizard()
    override fun createArcher() = FantasyArcher()
}