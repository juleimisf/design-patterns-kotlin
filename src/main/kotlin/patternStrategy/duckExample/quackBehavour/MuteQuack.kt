package patternStrategy.duckExample.quackBehavour

class MuteQuack : QuackBehavior {
    override fun quack() {
        println("<Mute>")
    }
}