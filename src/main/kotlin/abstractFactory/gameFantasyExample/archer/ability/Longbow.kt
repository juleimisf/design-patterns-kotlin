package abstractFactory.gameFantasyExample.archer.ability

import abstractFactory.gameFantasyExample.Ability

class Longbow : Ability() {
    override val name = "Longbow"
    override val damage = 50
    override val manaCost = 20
}