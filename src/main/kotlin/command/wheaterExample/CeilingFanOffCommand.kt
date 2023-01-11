package command.wheaterExample

class CeilingFanOffCommand(private val ceilingObject: CeilingFan) : Command {
    var preSpeed: Int = 0
    override fun execute() {
        preSpeed = ceilingObject.getSpeed()
        ceilingObject.off()
    }

    override fun undo() {
        when (preSpeed) {
            HIGH -> ceilingObject.high()
            MEDIUM -> ceilingObject.medium()
            LOW -> ceilingObject.low()
            else -> ceilingObject.off()
        }
    }
}