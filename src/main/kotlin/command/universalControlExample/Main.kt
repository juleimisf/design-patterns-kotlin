
import command.universalControlExample.concreteCommand.ConcreteOffTvCommand
import command.universalControlExample.concreteCommand.ConcreteOnRadioCommand
import command.universalControlExample.concreteCommand.ConcreteOnTvCommand
import command.universalControlExample.invoker.ButtonInvoker
import command.universalControlExample.receiver.ElectronicsReceiver


fun main(args: Array<String>) {

    val receiver = ElectronicsReceiver()

    //Option #1
    val tv = ConcreteOnTvCommand(receiver)
    var invoker = ButtonInvoker(tv)
    invoker.onClick()

    //Option #2
    val radio = ConcreteOnRadioCommand(receiver)
    invoker = ButtonInvoker(radio)
    invoker.onClick()

    //Option #3
    val tvOff = ConcreteOffTvCommand(receiver)
    invoker = ButtonInvoker(tvOff)
    invoker.onClick()

}