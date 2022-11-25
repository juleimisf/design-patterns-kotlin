package patternStrategy.footBallExample

class Team {
    private var strategy: PlayStrategy = WaitStrategy()

    fun play(numberOfPlayers: Int) {
        strategy.play(numberOfPlayers)
    }

    fun setStrategyValue(strategy: PlayStrategy) {
        this.strategy = strategy
    }

}