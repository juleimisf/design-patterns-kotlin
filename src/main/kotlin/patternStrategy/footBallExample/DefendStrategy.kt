package patternStrategy.footBallExample

class DefendStrategy : PlayStrategy {
    override fun play(numberOfPlayer: Int) {
        println("The team has not the ball, defending with $numberOfPlayer players... ")
    }
}