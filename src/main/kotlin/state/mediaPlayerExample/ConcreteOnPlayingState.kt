package state.mediaPlayerExample

class ConcreteOnPlayingState(override val context: Context) : State(context) {

    override fun onPause(): String {
        context.changeState(ConcreteOnLockState(context))
        context.setCurrentTrackAfterStop()
        return "Player stopped :("
    }

    override fun onPlay(): String {
        context.changeState(ConcreteOnReadyState(context))
        return "Player stopped..."
    }

    override fun onNext(): String {
        return context.nextTrack()
    }

    override fun onPrevious(): String {
        return context.previousTrack()
    }
}