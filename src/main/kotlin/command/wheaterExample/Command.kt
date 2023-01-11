package command.wheaterExample

interface Command {
    fun execute()
    fun undo()
}