package patternAbstractFactory.shapeExample

interface  Color {
     fun fill() : String
}

class Red : Color {
    override fun fill() = "this is red"
}

class Blue : Color {
    override fun fill() = "this is blue"
}