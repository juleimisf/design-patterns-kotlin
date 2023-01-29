package templateMethod.pokemonBattleExample

abstract class Battle {

    fun initBattle(){
        println("the trainers are choosing their pokemons...")
        choicePokemon()
        attack()
        receiveAttack()
        damage(10)
    }
    protected abstract fun choicePokemon()
    protected abstract fun attack()
    protected abstract fun receiveAttack()
    protected abstract fun damage(value : Int)
}