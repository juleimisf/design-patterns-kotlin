package abstractFactory.gameFantasyExample.wizard.ability

import abstractFactory.gameFantasyExample.Ability

class Fireball : Ability() {
    override val name = "Fireball"
    override val damage = 50
    override val manaCost = 20
}