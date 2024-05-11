package patternStrategy.duckExample

import patternStrategy.duckExample.quackBehavour.MuteQuack
import patternStrategy.duckExample.quackBehavour.Quack
import patternStrategy.duckExample.quackBehavour.Squeak

fun main(args: Array<String>) {

    val mallard = MallardDuck()
    mallard.run {
        display()
        performFly()
        performQuack()
    }

    val rubber = RubberDuck()
    rubber.display()
    rubber.performFly()
    rubber.performQuack()

    val decoy = DecoyDuck()
    decoy.display()
    decoy.performFly()
    decoy.performQuack()

    val duckCall = DuckCall(Quack())
    duckCall.performQuack()

    duckCall.setQuackBehavior(Squeak())
    duckCall.performQuack()

    duckCall.setQuackBehavior(MuteQuack())
    duckCall.performQuack()

}