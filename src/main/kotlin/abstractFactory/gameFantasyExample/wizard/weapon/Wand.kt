package abstractFactory.gameFantasyExample.wizard.weapon

import abstractFactory.gameFantasyExample.Weapon

class Wand : Weapon() {
    override val name = "Wand"
    override val damage = 20
    override val durability = 100
}