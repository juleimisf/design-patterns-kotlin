package composite

import java.util.Stack

class CompositeIterator(iterator: Iterator<MenuComponent>) : Iterator<MenuComponent> {
    private val stack = Stack<Iterator<MenuComponent>>()

    init {
        stack.push(iterator)
    }

    override fun hasNext(): Boolean {
        return if (stack.empty()) {
            false
        } else {
            val iterator = stack.peek()
            if (!iterator.hasNext()) {
                stack.pop()
                hasNext()
            } else {
                true
            }
        }
    }

    fun remove() = UnsupportedOperationException()
    override fun next(): MenuComponent {
        return if (hasNext()) {
            val iterator = stack.peek()
            val component = iterator.next()
            if (component is MenuItemLeaf) {
                stack.push(component.createIterator())
            }
            component
        } else {
            null!!
        }

    }
}