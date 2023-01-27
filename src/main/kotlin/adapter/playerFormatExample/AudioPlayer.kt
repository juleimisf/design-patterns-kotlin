package adapter.playerFormatExample

class AudioPlayer : MediaPlayer {
    override fun play(audioType: String, fileName: String) {
        when (audioType) {
            "MP3" -> println("$audioType $fileName")

            "MP4", "VLC" -> {
                val adapter = MediaAdapter(audioType)
                adapter.play(audioType, fileName)
            }
            else -> println("sorry no support $audioType")
        }
    }
}