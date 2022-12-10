package patternAbstractFactory.shapeExample

fun main(args: Array<String>) {
    val circleRed = ColorFactory()
    val squareBlue = ShapeFactory()

    println("Figura de color {${circleRed.getColor().fill()}}}")
    println("Figura {${squareBlue.getShape().draw()} creado")

}