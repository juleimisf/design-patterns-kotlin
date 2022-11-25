package patternStrategy.footBallExample

class AttackStrategy : PlayStrategy {
    override fun play(numberOfPlayer: Int) {
        println("The team has the ball, attacking with $numberOfPlayer players... ")
    }

}