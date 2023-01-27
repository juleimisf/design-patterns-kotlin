package adapter.birdExample

class BirdAdapter(val bird : Bird) : ToyDuck {
    override fun squeak() {
        bird.makeSound()
    }
}