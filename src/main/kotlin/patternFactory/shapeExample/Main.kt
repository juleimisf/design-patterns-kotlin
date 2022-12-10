package patternFactory.shapeExample


fun main(args: Array<String>) {

    val circle = ShapeFactory().buildShape(0)
    val square = ShapeFactory().buildShape(2)

    println("Tipo de figura: ${circle?.draw()}")
    println("Tipo de figura: ${square?.draw()}")

}