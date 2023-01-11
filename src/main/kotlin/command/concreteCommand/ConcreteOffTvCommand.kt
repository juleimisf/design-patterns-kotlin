package command.concreteCommand

import command.command.Command
import command.receiver.ElectronicsReceiver

class ConcreteOffTvCommand(private val receiver : ElectronicsReceiver) : Command {
    override fun execute() {
        receiver.off()
    }

}