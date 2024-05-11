package patternStrategy.duckExample

import patternStrategy.duckExample.flyBehavior.FlyWithWings
import patternStrategy.duckExample.flyBehavior.NoFly
import patternStrategy.duckExample.quackBehavour.MuteQuack
import patternStrategy.duckExample.quackBehavour.Quack

class DecoyDuck : Duck(NoFly(), MuteQuack()) {
    override fun display() {
        println("I'm a Decoy Duck for hunting.")
    }
}