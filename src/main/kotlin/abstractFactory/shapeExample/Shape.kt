package abstractFactory.shapeExample

interface  Shape {
     fun draw() : String
}

class Circle : Shape {
    override fun draw() = "this is a circle"
}

class Square : Shape {
    override fun draw() = "this is a square"
}