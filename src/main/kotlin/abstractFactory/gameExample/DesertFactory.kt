package abstractFactory.gameExample

import abstractFactory.Cactus
import abstractFactory.Sand

class DesertFactory : Factory {
    override fun createTerrain() = Sand()

    override fun createVegetation() = Cactus()
}