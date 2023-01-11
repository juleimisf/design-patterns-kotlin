package command.wheaterExample

class StereoWithCDCommand(private val stereoObject : Stereo) : Command {
    override fun execute() {
        stereoObject.let {
            it.on()
            it.setCd()
            it.setVolume(23)
        }
    }

    override fun undo() {
        stereoObject.off()
    }
}