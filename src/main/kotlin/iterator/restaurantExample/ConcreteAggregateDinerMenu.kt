package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem

class ConcreteAggregateDinerMenu(private val arrayMenu : Array<MenuItem>) : Aggregate {
    override fun createIterator(): Iterator<MenuItem> {
        return ConcreteDinerMenuIterator(arrayMenu)
    }
}