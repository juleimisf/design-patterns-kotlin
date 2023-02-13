package state.simpleExample

class ConcreteStateStart : State {
    override fun action(context: Context) {
        println("I'm in state start")
        context.setState(this)
    }

    override fun print() = "state start!"
}