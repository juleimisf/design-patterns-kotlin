package adapter.playerFormatExample

class MP4Player : AdvancedMediaPlayer {
    override fun playMp4(fileName: String) {
        println("current mp4-> $fileName")
    }

    override fun playVLC(fileName: String) {
        //TODO
    }

}