package iterator.restaurantExample

import kotlin.collections.Iterator

class PancakeHouseMenu(private val arrayMenu : ArrayList<MenuItem>) : MenuIterator {
    override fun createIterator(): Iterator<MenuItem> {
        return arrayMenu.iterator()
    }
}