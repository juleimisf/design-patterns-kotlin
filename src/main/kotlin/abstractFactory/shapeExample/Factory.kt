package abstractFactory.shapeExample

abstract class Factory {
    abstract fun getShape() : Shape?
    abstract fun getColor() : Color?

}