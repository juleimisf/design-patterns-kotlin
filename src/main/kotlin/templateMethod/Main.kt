package templateMethod

fun main() {

    println("Enter type of pizza")

    val pizza: PizzaTemplate = when (readln()) {
        "Hawaiana" -> HawaianaConcrete()
        "Pepperoni" -> PepperoniConcrete()
        "Vegan" -> VegetarianConcrete()
        "Neapolitan" -> NeapolitanConcrete()
        else -> throw IllegalArgumentException("Invalid pizza type")
    }

    pizza.make()
    println("Your ${readln()} is ready!!!")
    
}
