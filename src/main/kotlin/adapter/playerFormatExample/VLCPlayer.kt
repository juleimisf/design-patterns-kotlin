package adapter.playerFormatExample

class VLCPlayer : AdvancedMediaPlayer {
    override fun playMp4(fileName: String) {
        // TODO
    }

    override fun playVLC(fileName: String) {
        println("current VLC-> $fileName")
    }

}