package state.mediaPlayerExample


abstract class State(open val context: Context) {
    abstract fun onPause(): String
    abstract fun onPlay(): String
    abstract fun onNext(): String
    abstract fun onPrevious(): String
}