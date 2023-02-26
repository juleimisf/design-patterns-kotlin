package abstractFactory.gameFantasyExample

interface CharacterFactory {
    fun createAbility(): Ability
    fun createWeapon(): Weapon
}