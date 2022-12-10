package patternAbstractFactory.gameExample

import patternAbstractFactory.*

class ForestFactory : Factory {
    override fun createTerrain() = Grass()

    override fun createVegetation() = Tree()
}