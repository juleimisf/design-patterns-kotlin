package templateMethod

class NeapolitanConcrete : PizzaTemplate() {
    override fun putIngredients() {
        println("Adding olive")
        println("Adding tomatoes")
    }
}