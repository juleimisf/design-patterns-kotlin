package abstractFactory.gameExample

import abstractFactory.*

class ForestFactory : Factory {
    override fun createTerrain() = Grass()

    override fun createVegetation() = Tree()
}