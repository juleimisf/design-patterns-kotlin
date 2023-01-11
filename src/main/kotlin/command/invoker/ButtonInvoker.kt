package command.invoker

import command.command.Command

class ButtonInvoker(val command : Command) {
    fun onClick(){
        command.execute()
    }
}