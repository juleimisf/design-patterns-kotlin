package abstractFactory.gameFantasyExample.archer.weapon

import abstractFactory.gameFantasyExample.Weapon

class RecurveBow : Weapon() {
    override val name = "RecurveBow"
    override val damage = 25
    override val durability = 90
}