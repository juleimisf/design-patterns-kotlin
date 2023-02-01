package iterator.restaurantExample

import kotlin.collections.Iterator

class Waitress(private val pancakeHouseMenu: PancakeHouseMenu, private val dinerMenu: DinerMenu) {
    fun printMenu() {

        val pancakeIterator= pancakeHouseMenu.createIterator()
        val dinerIterator= dinerMenu.createIterator()
        println("MENU\\n----\n\nDESAYUNO”")
        printData(pancakeIterator)
        println("MENU\\n----\n\nALMUERZO””")
        printData(dinerIterator)
    }

    private fun printData(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}