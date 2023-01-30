package iterator

interface Collection<T> {
    fun createIterator(): Iterator<T>
}