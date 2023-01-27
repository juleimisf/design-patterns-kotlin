package facade.homeTheaterExample

class Facade(val projector: Projector, val popCorn: PopCorn, val dvdPlayer: DvdPlayer) {
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