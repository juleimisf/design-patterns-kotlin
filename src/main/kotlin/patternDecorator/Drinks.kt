package patternDecorator

abstract class Drink(val des : String = "pp") {
    abstract fun cost(): Double
}
class Espresso : Drink() {
    override fun cost() = 1.0

}

class Coffee : Drink("hola2") {
    override fun cost() = 2.0


}

class NonCaffeine : Drink() {
    override fun cost() = 2.5
}


abstract class AdditiveDecorator : Drink() {
    abstract fun description(): String
}

class MilkDecorator(private var drink: Drink) : AdditiveDecorator() {
    override fun description() = drink.des + " hola"

    override fun cost() = 1 + drink.cost()

    companion object {
        fun withDrink(newDrink: Drink) = MilkDecorator(newDrink)
    }
}

class CinnamonDecorator(var drink: Drink) : AdditiveDecorator(){
    override fun cost() = drink.cost() + 1
    override fun description() = "${drink.des} + Cinnamon"

    companion object {
        fun withDrink(newDrink: Drink) = CinnamonDecorator(newDrink)
    }
}

class HoneyDecorator(var drink: Drink) : AdditiveDecorator() {
    override fun cost() = drink.cost() + 1
    override fun description() = "${drink.des} + Honey"

    companion object {
        fun withDrink(newDrink: Drink) = CinnamonDecorator(newDrink)
    }
}
