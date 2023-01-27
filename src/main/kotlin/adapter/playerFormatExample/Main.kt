package adapter.playerFormatExample

fun main()
{
    val audioPlayer = AudioPlayer()
    audioPlayer.play("MP3", "Skay and Blue.mp3")
    audioPlayer.play("MP4", "Happy.mp4")
    audioPlayer.play("VLC", "newFormat.VLC")
    audioPlayer.play("iv", "newFormat.iv")


}