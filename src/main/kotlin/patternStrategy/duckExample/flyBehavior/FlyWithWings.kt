package patternStrategy.duckExample.flyBehavior

import patternStrategy.duckExample.flyBehavior.FlyBehavior

class FlyWithWings : FlyBehavior {
    override fun fly() {
        println("I'm flying with my wings!")
    }
}