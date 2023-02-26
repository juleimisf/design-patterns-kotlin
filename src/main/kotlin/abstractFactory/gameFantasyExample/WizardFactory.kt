package abstractFactory.gameFantasyExample

import abstractFactory.gameFantasyExample.wizard.ability.Fireball
import abstractFactory.gameFantasyExample.wizard.ability.IceBlast
import abstractFactory.gameFantasyExample.wizard.ability.PoisonCloud
import abstractFactory.gameFantasyExample.wizard.weapon.Staff
import abstractFactory.gameFantasyExample.wizard.weapon.Wand
import kotlin.random.Random

class WizardFactory : CharacterFactory {
    override fun createAbility(): Ability {
        return when (Random.nextInt(1, 4)) {
            1 -> Fireball()
            2 -> IceBlast()
            else -> PoisonCloud()
        }
    }

    override fun createWeapon(): Weapon {
        return when (Random.nextInt(1, 4)) {
            2 -> Staff()
            else -> Wand()
        }
    }
}