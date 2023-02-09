package composite

class MenuComposite(private val name: String, private val description: String) : MenuComponent() {
    private val menuComponents = mutableListOf<MenuComponent>()
    private var iterator: Iterator<MenuComponent>? = null

    override fun add(component: MenuComponent) {
        menuComponents.add(component)
    }

    override fun remove(component: MenuComponent) {
        menuComponents.remove(component)
    }

    override fun getChild(index: Int) = menuComponents[index]

    override fun getName() = name

    override fun getDescription() = description

    override fun print() {
        println("${getName()}\n${getDescription()}\n-----------")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }

    override fun createIterator(): Iterator<MenuComponent>{
        if (iterator == null) {
            iterator = CompositeIterator(menuComponents.iterator())
        }
        return iterator!!
    }
}