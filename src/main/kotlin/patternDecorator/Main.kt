package patternDecorator

fun main(args: Array<String>) {
    val drink : Drink = Coffee()

    println("Ordenaste: ${drink.des}\nCosto: ${drink.cost()}$")

    var drink2 : Drink = Coffee()
   var drink22 =  MilkDecorator(drink2)
    var drink222 =  HoneyDecorator(drink22)
    var drink2222=  CinnamonDecorator(drink222)



    println("Ordenaste: ${drink2}\nCosto: ${drink2.cost()}$")

}