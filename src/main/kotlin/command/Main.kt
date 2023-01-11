
import command.concreteCommand.ConcreteOffTvCommand
import command.concreteCommand.ConcreteOnRadioCommand
import command.concreteCommand.ConcreteOnTvCommand
import command.invoker.ButtonInvoker
import command.receiver.ElectronicsReceiver


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