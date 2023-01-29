package templateMethod.pokemonBattleExample

class CharizardBattle : Battle() {
    override fun choicePokemon() {
        println("Charizard was chose!")
    }

    override fun attack() {
        println("Charizard was attacked!")

    }

    override fun receiveAttack() {
        println("Charizard received an attack!")
    }

    override fun damage(value : Int) {
        println("$value damage...")
    }
}