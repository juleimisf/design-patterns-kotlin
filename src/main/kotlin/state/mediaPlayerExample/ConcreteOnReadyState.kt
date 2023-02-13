package state.mediaPlayerExample

class ConcreteOnReadyState(override val context: Context) : State(context) {

    override fun onPause(): String {
        context.changeState( ConcreteOnLockState(context))
        return "Can't stop!"
    }

    override fun onPlay(): String {
        val action = context.starPlay()
        context.changeState(ConcreteOnPlayingState(context))
        return action
    }

    override fun onNext(): String {
        return "Can't go to next!"
    }

    override fun onPrevious(): String {
        return "Can't go back!"
    }
}