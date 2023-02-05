package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem
import kotlin.collections.Iterator

class Waitress(
    private val pancakeHouseMenu: ConcreteAggregatePancakeHouseMenu,
    private val dinerMenu: ConcreteAggregateDinerMenu,
    private val cafeMenu: ConcreteCafeMenu,
) {
    fun printMenu() {

        val pancakeIterator = pancakeHouseMenu.createIterator()
        val dinerIterator = dinerMenu.createIterator()
        val cafeIterator = cafeMenu.createIterator()
        println("MENU\\n----\n\nDESAYUNO”")
        printData(pancakeIterator)
        println("MENU\\n----\n\nALMUERZO””")
        printData(dinerIterator)
        println("MENU\\n----\n\nCENA””")
        printData(cafeIterator)
    }

    private fun printData(iterator: Iterator<MenuItem>) {
        while (iterator.hasNext()) {
            val menuItem = iterator.next()
            println("${menuItem.name}, ${menuItem.price} -- ${menuItem.description}")
        }
    }
}