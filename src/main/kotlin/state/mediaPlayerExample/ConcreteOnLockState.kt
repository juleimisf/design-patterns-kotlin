package state.mediaPlayerExample

class ConcreteOnLockState(override val context: Context) : State(context) {

    init {
        context.setPlaying(false)
    }

    override fun onPause(): String {
        return if (context.isPlaying()) {
            context.changeState(ConcreteOnReadyState(context))
            "Stop playing!"
        } else {
            "Loked!"
        }
    }

    override fun onPlay(): String {
        context.changeState(ConcreteOnReadyState(context))
        return "Ready...!"
    }

    override fun onNext(): String {
        return "Loked!"
    }

    override fun onPrevious(): String {
        return "loked"
    }
}