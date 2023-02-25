package abstractFactory.shapeExample

class ColorFactory : Factory() {
    override fun getShape() = null

    override fun getColor() = Red()

}