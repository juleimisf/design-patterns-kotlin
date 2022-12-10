package patternFactory.shapeExample

class CircleShape : ShapeFactory() {
    override fun buildShape() = Circle()
}