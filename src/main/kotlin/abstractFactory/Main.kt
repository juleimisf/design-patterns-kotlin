package abstractFactory

/**
Develop a game in Kotlin with different types of characters such as warriors,
wizards, and archers. Each character has different characteristics, such as hit points,
strength, speed, etc.

The specific issue we are facing is that our game needs the ability to dynamically create
different types of characters. Characters may belong to different families, such as fantasy
or science fiction, and each family may have different attributes and specific behaviors.

 */
fun main() {

    val factory = FantasyCharacterFactory()
    val warrior = factory.createWarrior()
    val wizard = factory.createWizard()
    val archer = factory.createArcher()
}