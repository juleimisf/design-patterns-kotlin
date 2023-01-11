package command.concreteCommand

import command.command.Command
import command.receiver.ElectronicsReceiver

class ConcreteOnRadioCommand(private val receiver : ElectronicsReceiver) : Command {
    override fun execute() {
        receiver.on()
    }

}