package patternStrategy.footBallExample

class WaitStrategy : PlayStrategy {
    override fun play(numberOfPlayer: Int) {
        println("The team is waiting with $numberOfPlayer players... ")
    }
}