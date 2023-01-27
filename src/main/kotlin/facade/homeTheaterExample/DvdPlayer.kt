package facade.homeTheaterExample

class DvdPlayer {
    fun on() {
        println("It is dvp On!")
    }

    fun off() {
        println("It is dvp Off!")
    }

    fun play() {
        println("Dvd is playing...")
    }

    fun setVolume(value : Int) {
        println("Volume set $value")
    }

    fun pause() {
        println("Dvd is paused! :(")
    }
}