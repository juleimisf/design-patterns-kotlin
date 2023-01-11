package command.wheaterExample

const val HIGH = 3
const val MEDIUM = 2
const val LOW = 1
const val OFF = 0

class CeilingFan {

    private var speed: Int = 0

    fun high() {
        speed = HIGH
        println("HIGH")
    }

    fun medium() {
        speed = MEDIUM
        println("MEDIUM")

    }

    fun low() {
        speed = LOW
        println("LOW")
    }

    fun off() {
        speed = OFF
        println("OFF")
    }

    fun getSpeed() = speed

}