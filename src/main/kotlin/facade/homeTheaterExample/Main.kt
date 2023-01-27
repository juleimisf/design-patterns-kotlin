package facade.homeTheaterExample

fun main() {
    val projector = Projector()
    val popCorn = PopCorn()
    val dvd = DvdPlayer()

    val facade = Facade(projector, popCorn, dvd)
    facade.init()
    facade.off()
}