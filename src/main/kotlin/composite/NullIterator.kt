package composite

class NullIterator<T> : Iterator<T> {
    override fun hasNext(): Boolean = false
    override fun next(): T = null!!
    fun remove(): Nothing = throw UnsupportedOperationException()
}