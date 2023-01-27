package adapter.birdExample
fun main(){
    val sparrow = Sparrow()
    val plasticToyDuck = PlasticToyDuck()

    val adapter = BirdAdapter(bird = sparrow)

    sparrow.fly()
    sparrow.makeSound()

    plasticToyDuck.squeak()

    adapter.squeak()
}