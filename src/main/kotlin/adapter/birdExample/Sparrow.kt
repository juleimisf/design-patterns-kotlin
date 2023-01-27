package adapter.birdExample

import adapter.birdExample.Bird

class Sparrow : Bird {
    override fun fly() {
        println("Sparrow is flying")
    }

    override fun makeSound() {
        println("Sparrow is making sound")
    }
}