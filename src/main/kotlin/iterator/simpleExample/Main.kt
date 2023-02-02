package iterator.simpleExample

fun main() {
    val obj = ObjectExample(1,"des")
    val listChar = listOf("a", "b", "c", "d", "e")
    val listNumber = listOf(1, 2, 3, 4, 5)
    val listObjects = listOf(obj, obj, obj)

    val aggregate = ConcreteAggregate(listObjects)
    val iterator = aggregate.createIterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }
}

data class ObjectExample(
    val id : Int,
    val name : String
)