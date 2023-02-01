package iterator.restaurantExample

import kotlin.collections.Iterator

interface MenuIterator {
    fun createIterator() : Iterator<MenuItem>
}