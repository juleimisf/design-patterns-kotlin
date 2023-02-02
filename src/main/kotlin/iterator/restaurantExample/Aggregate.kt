package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem
import kotlin.collections.Iterator

interface Aggregate {
    fun createIterator() : Iterator<MenuItem>
}