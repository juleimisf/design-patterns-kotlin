package adapter.playerFormatExample

class MediaAdapter(type: String) : MediaPlayer {

    var advancedMediaPlayer : AdvancedMediaPlayer? = null
    init {
        advancedMediaPlayer = when (type) {
            "VLC" -> VLCPlayer()
            else -> MP4Player()
        }
    }

    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "VLC" -> advancedMediaPlayer?.playVLC(fileName)
            "MP4" -> advancedMediaPlayer?.playMp4(fileName)
        }
    }
}