package command.universalControlExample

class MacroCommand(private val command : List<Command>) : Command {

    override fun execute() {
        for (i in command){
            i.execute()
        }
    }

    override fun undo() {
        for (i in command){
            i.undo()
        }
    }
}