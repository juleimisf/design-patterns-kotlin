package command.wheaterExample.undo

import command.wheaterExample.Command

class NoCommand : Command {
    override fun execute() {
        print("execute no command")
    }

    override fun undo() {
        print("undo no command")
    }
}