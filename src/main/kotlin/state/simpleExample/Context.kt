package state.simpleExample

class Context {
    private var state : State? = null

    fun setState(state : State){
        this.state = state
    }

    fun getState() = state
}