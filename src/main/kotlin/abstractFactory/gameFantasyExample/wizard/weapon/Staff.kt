package abstractFactory.gameFantasyExample.wizard.weapon

import abstractFactory.gameFantasyExample.Weapon

class Staff : Weapon() {
    override val name = "Staff"
    override val damage = 20
    override val durability = 100
}