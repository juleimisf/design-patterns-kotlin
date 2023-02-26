package abstractFactory.gameFantasyExample

/**
Imagine that you are developing a fantasy game in Kotlin and you need to implement different types of
characters, such as a wizard, a warrior, an archer, etc.

1. Each character has different abilities and weapons that set them apart, such as a wizard who can cast
fire spells, a warrior who can block attacks with his shield, and an archer who can shoot poison arrows.

2. It is important that the code is easily scalable and maintainable, so the Abstract Factory pattern should be implemented.

3. The Abstract Factory pattern allows us to create families of related objects without specifying their
concrete classes. In this case, an abstract factory called CharacterFactory can be created that has
methods for creating different parts of a character, such as abilities and weapons.

4. Each type of character (mage, warrior, archer, etc.) will have its own specific factory that implements
the CharacterFactory methods to create that character's specific abilities and weapons.

5. By using the Abstract Factory pattern, new character types and weapons can be easily added in
the future without having to modify existing code.

 */
fun main() {

    val wizardFactory = WizardFactory()
    val archerFactory = ArcherFactory()

    archerFactory.createAbility()
    archerFactory.createWeapon()

    wizardFactory.createAbility()
    wizardFactory.createWeapon()

}