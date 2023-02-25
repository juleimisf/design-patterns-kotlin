package abstractFactory.gameExample

import abstractFactory.Terrain
import abstractFactory.Vegetation

interface Factory {
    fun createTerrain() : Terrain
    fun createVegetation() : Vegetation
}