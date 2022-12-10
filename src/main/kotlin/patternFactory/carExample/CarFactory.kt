package patternFactory.carExample

object CarFactory {
    fun buildCar(type: TypeCar.TypesCars): ICar? {
        return when (type) {
            TypeCar.TypesCars.SMALL -> {

                SmallCar()
            }
            TypeCar.TypesCars.LUXURY -> {
                LuxuryCar()
            }
            else -> {
                null
            }
        }
    }
}