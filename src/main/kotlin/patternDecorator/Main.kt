package patternDecorator

fun main(args: Array<String>) {
    val coffee = Coffee()
    val additional = CinnamonDecorator.withDrink(coffee)
    println("Ordenaste: ${additional.description()}\nCosto: ${additional.cost()}$")

}