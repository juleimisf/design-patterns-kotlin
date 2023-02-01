package iterator.restaurantExample

class DinerMenu(private val arrayMenu : Array<MenuItem>) : MenuIterator {
    override fun createIterator(): kotlin.collections.Iterator<MenuItem> {
        return arrayMenu.iterator()
    }
}