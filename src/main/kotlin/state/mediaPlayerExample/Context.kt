package state.mediaPlayerExample

class Context {
    private var playList = mutableListOf<String>()
    private var state: State? = null
    private var currentTrack = 0
    private var playing = false

    init {
        state = ConcreteOnReadyState(this)
        playing = true
        for (i in 0..5) {
            playList.add("Track #$i")
        }
    }

    fun changeState(state: State) {
        this.state = state
    }

    fun getState() = state

    fun starPlay(): String {
        return "PLaying ${playList[currentTrack]}"
    }

    fun nextTrack(): String {
        currentTrack++
        if (currentTrack > playList.size - 1) {
            currentTrack = 0
        }

        return "Playing ${playList[currentTrack]}"

    }

    fun setPlaying(status: Boolean) {
        this.playing = status
    }

    fun isPlaying() = playing

    fun setCurrentTrackAfterStop() {
        this.currentTrack = 0
    }

    fun previousTrack(): String {
        currentTrack--
        if (currentTrack < 0) {
            currentTrack = playList.size - 1
        }
        return "previous Playing ${playList[currentTrack]}"
    }

}