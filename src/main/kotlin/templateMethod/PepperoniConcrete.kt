package templateMethod

class PepperoniConcrete : PizzaTemplate() {
    override fun putIngredients() {
        println("Adding mushrooms")
        println("Adding tomatoes")
        println("Adding pepperoni")

    }
}