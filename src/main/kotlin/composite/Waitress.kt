package composite

class Waitress(private val allMenu: MenuComponent) {
    fun printMenu() {
        allMenu.print()
    }

    fun printVegetarianMenu() {
        val iterator: Iterator<MenuComponent> = allMenu.createIterator()
        println("\nVEGETARIAN MENU\n----”")
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print()
                }
            } catch (_: UnsupportedOperationException) {

            }
        }
    }
}