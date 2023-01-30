package iterator

fun main() {
    val listChar = listOf("a", "b", "c", "d", "e")
    val listNumber = listOf(1, 2, 3, 4, 5)
    val aggregate = ConcreteCollection(listChar)
    val iterator = aggregate.createIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}