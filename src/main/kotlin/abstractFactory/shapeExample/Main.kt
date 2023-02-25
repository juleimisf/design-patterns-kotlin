package abstractFactory.shapeExample

fun main(args: Array<String>) {
    val color = FactoryProvider().getFactoryColor()
    val shape = FactoryProvider().getFactoryShape()

    println("Figura de color {${color.getColor()?.fill()}}}")
    println("Figura {${shape.getShape()?.draw()} creado")

}