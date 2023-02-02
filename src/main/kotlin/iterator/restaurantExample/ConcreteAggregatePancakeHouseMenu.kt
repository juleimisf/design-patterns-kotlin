package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem
import kotlin.collections.Iterator

class ConcreteAggregatePancakeHouseMenu(private val arrayMenu : ArrayList<MenuItem>) : Aggregate {
    override fun createIterator(): Iterator<MenuItem> {
        return ConcretePancakeHouseIterator(arrayMenu)
    }
}