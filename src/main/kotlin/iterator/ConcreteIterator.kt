package iterator

class ConcreteIterator<T>(private val items: List<T>) : Iterator<T> {
    private var index = 0
    override fun next(): T {
        if (hasNext()) {
            return items[index]
        } else {
            throw NoSuchElementException()
        }
    }

    override fun hasNext() = index < items.size
}