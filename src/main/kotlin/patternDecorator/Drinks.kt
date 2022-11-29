package patternDecorator

abstract class Drink(val desc: String = "Non drink name") {
    abstract fun cost(): Double
}

class Coffee : Drink("Black coffee") {
    override fun cost() = 2.50

}

class NonCaffeine : Drink("Non caffeinated coffe") {
    override fun cost() = 2.5
}

abstract class AdditiveDecorator : Drink() {
    abstract fun description(): String
}

class MilkDecorator(val drink: Drink) : AdditiveDecorator() {
    override fun description() = "${drink.desc} + Milk"

    override fun cost() = 0.5

    companion object {
        fun withDrink(newDrink: Drink) = MilkDecorator(newDrink)
    }
}

class CinnamonDecorator(val drink: Drink) : AdditiveDecorator() {
    override fun cost() = drink.cost() + 1.0
    override fun description() = "${drink.desc} + Cinnamon"

    companion object {
        fun withDrink(newDrink: Drink) = CinnamonDecorator(newDrink)
    }

}
