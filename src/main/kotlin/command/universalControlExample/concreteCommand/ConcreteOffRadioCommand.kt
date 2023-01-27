package command.universalControlExample.concreteCommand

import command.universalControlExample.command.Command
import command.universalControlExample.receiver.ElectronicsReceiver

class ConcreteOffRadioCommand(private val receiver : ElectronicsReceiver) : Command {
    override fun execute() {
        receiver.off()
    }
}