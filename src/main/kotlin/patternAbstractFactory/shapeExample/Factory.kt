package patternAbstractFactory.shapeExample

abstract class Factory {
    abstract fun getShape() : Shape?
    abstract fun getColor() : Color?

}