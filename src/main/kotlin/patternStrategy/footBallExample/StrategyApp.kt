package patternStrategy.footBallExample


fun main(args: Array<String>) {
    val team = Team()
    team.play(0)

    team.setStrategyValue(AttackStrategy())
    team.play(11)

    team.setStrategyValue(DefendStrategy())
    team.play(10)

}