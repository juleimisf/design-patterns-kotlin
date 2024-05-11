package patternStrategy.duckExample

import patternStrategy.duckExample.flyBehavior.FlyWithWings
import patternStrategy.duckExample.quackBehavour.Quack

class RedheadDuck : Duck(FlyWithWings(), Quack()) {
    override fun display() {
        println("I'm a real Redhead Duck")
    }
}