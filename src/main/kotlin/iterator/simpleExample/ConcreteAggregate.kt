package iterator.simpleExample

class ConcreteAggregate<T>(private val items: List<T>) : Aggregate<T> {
    override fun createIterator() = ConcreteIterator(items)
}