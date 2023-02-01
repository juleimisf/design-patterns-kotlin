package iterator.simpleExample

interface Iterator<T> {
    fun next() : T
    fun hasNext() : Boolean
}