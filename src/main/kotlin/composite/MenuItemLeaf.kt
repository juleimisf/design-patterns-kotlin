package composite

class MenuItemLeaf(
    private val name: String,
    private val description: String,
    private val price: Double,
    private val isVegetarian : Boolean = false
) : MenuComponent() {

    override fun getName() = name

    override fun getDescription() = description

    override fun getPrice() = price

    override fun print() {
        println("${getName()} *** ${getDescription()} *** ${getPrice()}")
    }

    override fun isVegetarian() = isVegetarian

    override fun createIterator() : Iterator<MenuComponent>{
        return NullIterator()
    }

}