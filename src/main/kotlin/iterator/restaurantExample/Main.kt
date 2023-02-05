package iterator.restaurantExample

import iterator.restaurantExample.model.MenuItem

fun main(){
    val pancakeHouseMenu = ConcreteAggregatePancakeHouseMenu(arrayListOf(
        MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99),
        MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99),
        MenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49),
        MenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59)
    ))

    val dinerMenu = ConcreteAggregateDinerMenu(arrayOf(
        MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99),
        MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99),
        MenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29),
        MenuItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05)
    ))

    val cafeMenu = ConcreteCafeMenu(arrayOf(
        MenuItem("Tacos", "Nothing", true, 5.99),
    ))

    val waitress = Waitress(pancakeHouseMenu, dinerMenu, cafeMenu)
    waitress.printMenu()
}