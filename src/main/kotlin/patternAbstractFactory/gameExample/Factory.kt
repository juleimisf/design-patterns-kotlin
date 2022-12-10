package patternAbstractFactory.gameExample

import patternAbstractFactory.Terrain
import patternAbstractFactory.Vegetation

interface Factory {
    fun createTerrain() : Terrain
    fun createVegetation() : Vegetation
}