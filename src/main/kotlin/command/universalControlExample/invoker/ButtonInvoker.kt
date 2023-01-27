package command.universalControlExample.invoker

import command.universalControlExample.command.Command

class ButtonInvoker(val command : Command) {
    fun onClick(){
        command.execute()
    }
}