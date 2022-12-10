package patternAbstractFactory.shapeExample

class ShapeFactory : Factory(){
    override fun getShape() = Circle()

    override fun getColor() = null

}