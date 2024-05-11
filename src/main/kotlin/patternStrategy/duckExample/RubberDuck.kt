package patternStrategy.duckExample

import patternStrategy.duckExample.flyBehavior.FlyWithWings
import patternStrategy.duckExample.flyBehavior.NoFly
import patternStrategy.duckExample.quackBehavour.Quack
import patternStrategy.duckExample.quackBehavour.Squeak

class RubberDuck : Duck(NoFly(), Squeak()) {
    override fun display() {
        println("I'm a toy Rubber Duck.")
    }
}