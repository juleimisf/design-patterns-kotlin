package patternDecorator

interface Drink {
    fun cost(): Double
    fun getDescription(): String
}

class DarkRoast : Drink {
    override fun cost() = 1.0
    override fun getDescription() = "Dark Roast"
}

class Coffee : Drink {
    override fun cost() = 1.1
    override fun getDescription() = "Black coffee"

}

class NonCaffeine : Drink {
    override fun cost() = 2.0
    override fun getDescription() = "Non Caffeine"
}

abstract class AdditiveDecorator : Drink

class MilkDecorator(var drink: Drink) : AdditiveDecorator() {
    override fun cost() = drink.cost() + 1.0
    override fun getDescription() = drink.getDescription() + " + Milk"

    companion object {
        fun withDrink(newDrink: Drink) = MilkDecorator(newDrink)
    }
}

class CinnamonDecorator(var drink: Drink) : AdditiveDecorator() {
    override fun cost() = drink.cost() + 1.0
    override fun getDescription() = drink.getDescription() + " + Cinnamon"
    companion object {
        fun withDrink(newDrink: Drink) = CinnamonDecorator(newDrink)
    }
}
