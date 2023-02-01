package iterator.taskExample

import iterator.simpleExample.ConcreteCollection

fun main(){
    val task = Task (id = 0 , name = "Buy milk")
    val task2 = Task (id = 1 , name = "Buy oil")
    val task3 = Task (id = 2 , name = "Buy apples")
    val taskList = arrayListOf(task, task2, task3)

    val aggregate = ConcreteCollection(taskList)
    val iterator = aggregate.createIterator()
    while (iterator.hasNext()) {
        println(iterator.next().name)
    }
}

data class Task(
    val id : Int,
    val name : String
)