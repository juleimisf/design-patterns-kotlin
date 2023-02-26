package abstractFactory.gameFantasyExample

import abstractFactory.gameFantasyExample.archer.ability.Bow
import abstractFactory.gameFantasyExample.archer.ability.Crossbow
import abstractFactory.gameFantasyExample.archer.ability.Longbow
import abstractFactory.gameFantasyExample.archer.weapon.RecurveBow
import abstractFactory.gameFantasyExample.archer.weapon.CompositeBow
import abstractFactory.gameFantasyExample.archer.weapon.Shortbow
import kotlin.random.Random

class ArcherFactory : CharacterFactory {
    override fun createAbility(): Ability {
        return when (Random.nextInt(1, 4)) {
            1 -> Bow()
            2 -> Crossbow()
            else -> Longbow()
        }
    }

    override fun createWeapon(): Weapon {
        return when (Random.nextInt(1, 4)) {
            1 -> CompositeBow()
            2 -> RecurveBow()
            else -> Shortbow()
        }
    }
}