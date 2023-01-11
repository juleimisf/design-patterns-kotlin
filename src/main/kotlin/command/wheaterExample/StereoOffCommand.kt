package command.wheaterExample

class StereoOffCommand(private val stereoObject : Stereo) : Command {
    override fun execute() {
        stereoObject.off()
    }

    override fun undo() {
       stereoObject.let {
           it.on()
           it.setCd()
           it.setVolume(23)
       }
    }
}