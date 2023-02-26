package abstractFactory.gameFantasyExample.archer.ability

import abstractFactory.gameFantasyExample.Ability

class Bow : Ability() {
    override val name = "Bow"
    override val damage = 50
    override val manaCost = 20
}