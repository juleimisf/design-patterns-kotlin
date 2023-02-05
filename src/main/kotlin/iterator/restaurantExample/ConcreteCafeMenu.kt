package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem

class ConcreteCafeMenu(private val arrayMenu : Array<MenuItem>) : Aggregate {
    override fun createIterator(): Iterator<MenuItem> {
        return ConcreteCafeIterator(arrayMenu)
    }
}