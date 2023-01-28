package facade.homeTheaterExample

class Facade(private val projector: Projector, private val popCorn: PopCorn, private val dvdPlayer: DvdPlayer) {
    fun init(){
        projector.on()
        dvdPlayer.on()
        popCorn.on()
        dvdPlayer.play()
        dvdPlayer.setVolume(10)
    }

    fun off(){
        projector.off()
        dvdPlayer.off()
    }
}