package command.wheaterExample

class GarageDoorOpenCommand(private val mObject: GarageDoor) : Command {
    override fun execute() {
        mObject.up()
    }

    override fun undo() {
        mObject.down()
    }

}