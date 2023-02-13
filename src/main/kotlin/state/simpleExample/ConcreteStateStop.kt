package state.simpleExample

class ConcreteStateStop : State {
    override fun action(context: Context) {
        println("I'm in stop state")
        context.setState(this)
    }

    override fun print() = "state stop!"
}