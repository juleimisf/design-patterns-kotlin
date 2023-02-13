package state.simpleExample

fun main() {

    val context = Context()

    val startState = ConcreteStateStart()
    val stopState = ConcreteStateStop()

    startState.action(context)
    println(context.getState()?.print())

    stopState.action(context)
    println(context.getState()?.print())

}