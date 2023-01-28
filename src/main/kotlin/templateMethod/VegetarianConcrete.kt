package templateMethod

class VegetarianConcrete : PizzaTemplate() {
    override fun putIngredients() {
        println("Adding mushrooms")
        println("Adding tomatoes")
        println("Adding onions")
        println("Adding olive")
    }
}