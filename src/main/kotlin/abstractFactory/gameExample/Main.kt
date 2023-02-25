package abstractFactory

import abstractFactory.gameExample.DesertFactory
import abstractFactory.gameExample.ForestFactory

fun main(args: Array<String>) {
    val desert = DesertFactory()
    val forest = ForestFactory()

    println("Desierto creado {${desert.createTerrain().print()}}")
    println("Vegetacion del desierto creado {${desert.createVegetation().print()}}")

}