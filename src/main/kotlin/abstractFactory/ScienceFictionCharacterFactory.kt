package abstractFactory

class ScienceFictionCharacterFactory : CharacterFactory {
    override fun createWarrior() = WarriorScienceFiction()
    override fun createWizard() = WarriorScienceFiction()
    override fun createArcher() = WarriorScienceFiction()
}