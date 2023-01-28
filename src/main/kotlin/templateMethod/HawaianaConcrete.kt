package templateMethod

class HawaianaConcrete : PizzaTemplate() {
    override fun putIngredients() {
        println("Adding pineapple")
        println("Adding tomatoes")
        println("Adding ham")
    }

    override fun bake() {
        println("baking for 10 minutes")
    }
}