package iterator.simpleExample

interface Aggregate<T> {
    fun createIterator(): Iterator<T>
}