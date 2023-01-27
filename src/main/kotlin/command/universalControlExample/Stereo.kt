package command.universalControlExample

class Stereo {
    fun on() = println("on")
    fun off() = println("off")
    fun setCd() = println("setCd")
    fun setDvd() = println("setDvd")
    fun setRadio() = println("setRadio")
    fun setVolume(value : Int) = println("setVolume on $value")

}