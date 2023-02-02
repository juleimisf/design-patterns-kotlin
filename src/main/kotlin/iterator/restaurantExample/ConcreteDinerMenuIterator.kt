package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem
import kotlin.collections.Iterator

class ConcreteDinerMenuIterator(private val items: Array<MenuItem>) : Iterator<MenuItem> {
    private var index = 0
    override fun hasNext() = index < items.size
    override fun next(): MenuItem {
        if (hasNext()) {
            return items[index++]
        } else {
            throw NoSuchElementException()
        }
    }
}