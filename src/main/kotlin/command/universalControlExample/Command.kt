package command.universalControlExample

interface Command {
    fun execute()
    fun undo()
}