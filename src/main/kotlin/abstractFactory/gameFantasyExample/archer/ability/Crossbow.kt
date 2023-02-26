package abstractFactory.gameFantasyExample.archer.ability

import abstractFactory.gameFantasyExample.Ability

class Crossbow  : Ability() {
    override val name = "Crossbow"
    override val damage = 50
    override val manaCost = 20
}