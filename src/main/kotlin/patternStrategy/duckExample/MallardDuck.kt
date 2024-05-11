package patternStrategy.duckExample

import patternStrategy.duckExample.flyBehavior.FlyWithWings
import patternStrategy.duckExample.quackBehavour.Quack

class MallardDuck : Duck(FlyWithWings(), Quack()) {
    override fun display() {
        println("I'm a real Mallard Duck.")
    }
}