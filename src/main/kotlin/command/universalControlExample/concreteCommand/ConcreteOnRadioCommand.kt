package command.universalControlExample.concreteCommand

import command.universalControlExample.command.Command
import command.universalControlExample.receiver.ElectronicsReceiver

class ConcreteOnRadioCommand(private val receiver : ElectronicsReceiver) : Command {
    override fun execute() {
        receiver.on()
    }

}