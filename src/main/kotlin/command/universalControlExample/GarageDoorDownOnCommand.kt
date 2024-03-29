package command.universalControlExample

class GarageDoorDownOnCommand(private val mObject: GarageDoor) : Command {
    override fun execute() {
        mObject.down()
    }

    override fun undo() {
        mObject.up()
    }
}