package command.universalControlExample

class TvOffCommand(private val tv: Tv) : Command {
    override fun execute() {
        tv.off()
    }

    override fun undo() {
        tv.on()
    }
}