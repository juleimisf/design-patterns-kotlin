package iterator.restaurantExample

interface Iterator<T> {
    fun next() : T
    fun hasNext() : Boolean
}