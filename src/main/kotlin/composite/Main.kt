package composite

fun main() {

    val pancakeHouseMenu = MenuComposite(name = "PANCAKE HOUSE MENU", description = "Breakfast")
    val dinerMenu = MenuComposite(name = "DINER MENU", description = "Lunch")
    val cafeMenu = MenuComposite(name = "CAFE MENU", description = "Dinner")
    val dessertMenu = MenuComposite(name = "DESSERT MENU", description = "Dessert of course!")

    val allMenus = MenuComposite(name = "ALL MENUS", description = "All menus combined")

    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)

    dinerMenu.add(MenuItemLeaf("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", 2.99))
    dinerMenu.add(MenuItemLeaf("BLT", "Bacon with lettuce & tomato on whole wheat", 2.99))
    dinerMenu.add(MenuItemLeaf("Soup of the day", "Soup of the day, with a side of potato salad", 3.29))
    dinerMenu.add(MenuItemLeaf("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", 3.05))
    dinerMenu.add(MenuItemLeaf("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", 7.0, true))
    dinerMenu.add(dessertMenu)

    dessertMenu.add(
        MenuItemLeaf(
            name = "Apple Pie",
            description = "Apple pie with a flakey crust, topped with vanilla icecream",
            price = 1.2
        )
    )

    val waitress = Waitress(allMenus)
    waitress.printMenu()
    waitress.printVegetarianMenu()

}