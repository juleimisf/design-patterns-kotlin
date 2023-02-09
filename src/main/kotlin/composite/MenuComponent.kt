package composite

abstract class MenuComponent {

    open fun add(component: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun remove(component: MenuComponent) {
        throw UnsupportedOperationException()
    }

    open fun getChild(index: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    abstract fun getName(): String

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    abstract fun getDescription(): String

    open fun getPrice(): Double {
        throw UnsupportedOperationException()
    }

    abstract fun print()

    abstract fun createIterator() : Iterator<MenuComponent>
}