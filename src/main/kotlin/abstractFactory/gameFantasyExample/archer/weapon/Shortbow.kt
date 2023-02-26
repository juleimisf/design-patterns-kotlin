package abstractFactory.gameFantasyExample.archer.weapon

import abstractFactory.gameFantasyExample.Weapon

class Shortbow : Weapon() {
    override val name = "Shortbow"
    override val damage = 20
    override val durability = 100
}