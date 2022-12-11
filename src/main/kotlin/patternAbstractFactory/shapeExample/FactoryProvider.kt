package patternAbstractFactory.shapeExample

class FactoryProvider {
    fun getFactoryColor() : Factory {
        return ColorFactory()
    }

    fun getFactoryShape() : Factory {
        return ShapeFactory()
    }
}