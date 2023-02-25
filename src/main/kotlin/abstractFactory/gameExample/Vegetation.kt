package abstractFactory

abstract class Vegetation {
    abstract fun print(): String
}

class Cactus : Vegetation() {
    override fun print() = "Vegetation-this is cactuis"
}

class Tree : Vegetation(){
    override fun print() = "Vegetation-this is tree"

}