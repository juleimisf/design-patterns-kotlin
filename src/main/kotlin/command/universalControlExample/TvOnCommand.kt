package command.universalControlExample

class TvOnCommand(private val tv: Tv) :Command {
    override fun execute() {
        tv.on()
    }

    override fun undo() {
        tv.off()
    }
}