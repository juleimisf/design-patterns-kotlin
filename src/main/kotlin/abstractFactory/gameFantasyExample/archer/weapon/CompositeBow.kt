package abstractFactory.gameFantasyExample.archer.weapon

import abstractFactory.gameFantasyExample.Weapon

class CompositeBow : Weapon() {
    override val name = "CompositeBow"
    override val damage = 30
    override val durability = 80
}