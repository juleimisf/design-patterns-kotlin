package patternFactory.carExample

fun main(args: Array<String>) {

    val car1 = CarFactory.buildCar(TypeCar.TypesCars.SMALL)
    val car2 = CarFactory.buildCar(TypeCar.TypesCars.LUXURY)

    println("El nombre del auto es: ${car1?.name()} y el tamaño es: ${car1?.size()}")
    println("El nombre del auto es: ${car2?.name()} y el tamaño es: ${car2?.size()}")

}