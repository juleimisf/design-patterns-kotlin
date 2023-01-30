package iterator

class ConcreteCollection<T>(private val items: List<T>) : Collection<T> {
    override fun createIterator() = ConcreteIterator(items)
}