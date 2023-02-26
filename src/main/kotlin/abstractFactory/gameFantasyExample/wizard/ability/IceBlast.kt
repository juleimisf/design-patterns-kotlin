package abstractFactory.gameFantasyExample.wizard.ability

import abstractFactory.gameFantasyExample.Ability

class IceBlast : Ability() {
    override val name = "Ice Blast"
    override val damage = 40
    override val manaCost = 15
}