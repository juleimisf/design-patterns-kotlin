package abstractFactory.gameFantasyExample.wizard.ability

import abstractFactory.gameFantasyExample.Ability

class PoisonCloud : Ability() {
    override val name = "Poison Cloud"
    override val damage = 30
    override val manaCost = 10
}