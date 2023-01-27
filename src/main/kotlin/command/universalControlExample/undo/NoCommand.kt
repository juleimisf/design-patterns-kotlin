package command.universalControlExample.undo

import command.universalControlExample.Command

class NoCommand : Command {
    override fun execute() {
        print("execute no command")
    }

    override fun undo() {
        print("undo no command")
    }
}