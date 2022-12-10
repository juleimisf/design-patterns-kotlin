package patternAbstractFactory.gameExample

import patternAbstractFactory.Cactus
import patternAbstractFactory.Sand

class DesertFactory : Factory {
    override fun createTerrain() = Sand()

    override fun createVegetation() = Cactus()
}