package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem
import kotlin.collections.Iterator

class ConcretePancakeHouseIterator(private val items : ArrayList<MenuItem>) : Iterator<MenuItem>  {
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