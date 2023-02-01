package iterator.simpleExample

interface Collection<T> {
    fun createIterator(): Iterator<T>
}