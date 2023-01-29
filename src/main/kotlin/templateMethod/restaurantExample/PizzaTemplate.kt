package templateMethod.restaurantExample

abstract class PizzaTemplate {
    fun make() {
        mixed()
        flatten()
        putIngredients()
        bake()
    }

    open fun mixed() {
        println("Mixing...")
    }

    open fun flatten() {
        println("Mash...")

    }

    abstract fun putIngredients()

    open fun bake() {
        println("Bake")
    }
}