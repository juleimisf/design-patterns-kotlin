package patternStrategy.duckExample

import patternStrategy.duckExample.flyBehavior.FlyBehavior
import patternStrategy.duckExample.quackBehavour.QuackBehavior

abstract class Duck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior) {
    fun performFly(){
        flyBehavior.fly()
    }

    fun performQuack(){
        quackBehavior.quack()
    }
    abstract fun display()
}