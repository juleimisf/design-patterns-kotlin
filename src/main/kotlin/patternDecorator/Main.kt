package patternDecorator

fun main(args: Array<String>) {
    var coffee: Drink = Coffee()
    coffee = CinnamonDecorator.withDrink(coffee)
    coffee = CinnamonDecorator.withDrink(coffee)
    coffee = MilkDecorator.withDrink(coffee)

    println("Ordenaste: ${coffee.getDescription()}\nCosto: ${coffee.cost()}$")

}