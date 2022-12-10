package patternFactory.shapeExample

fun main(args: Array<String>) {
    var shape: ShapeFactory
    shape = CircleShape()
    println("Tipo de figura: ${shape.buildShape().draw()}")
}