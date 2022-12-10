package patternFactory.shapeExample

class ShapeFactory {
    fun buildShape(type : Int) : IShape?{
        return when(type){
            0-> Circle()
            1-> Rectangle()
            2-> Square()
            else-> null
        }
    }
}