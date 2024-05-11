package patternStrategy.duckExample.flyBehavior

import patternStrategy.duckExample.flyBehavior.FlyBehavior

class NoFly : FlyBehavior {
    override fun fly() {
        println("I can´t fly! :(")
    }
}