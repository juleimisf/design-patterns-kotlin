package abstractFactory

abstract class Terrain{
    abstract fun print() : String
}
class Sand : Terrain() {
    override fun print()  = "Terrain-this is sand"
}

class Grass : Terrain(){
    override fun print()  = "Terrain-this is grass"

}