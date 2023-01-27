package command.universalControlExample

import command.universalControlExample.undo.NoCommand
import command.universalControlExample.undo.RemoteControlWithUndoInvoker


fun main() {
    val light = Light()
    val lightOn = LightOnCommand(light)
    val lightOff = LightOffCommand(light)

    val listOfOnCommand = mutableListOf(lightOn)
    val listOfOffCommand = mutableListOf(lightOff)

    val noCommand = NoCommand()
    var remoteControl = RemoteControlWithUndoInvoker(
        listOfOnCommand.toMutableList(),
        listOfOffCommand.toMutableList(), noCommand
    )

    remoteControl.setCommand(0, lightOn, lightOff)


    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

    println(remoteControl.printToString())

    remoteControl.undoButtonWasPushed()

    remoteControl.offButtonWasPushed(0)
    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

    println(remoteControl.printToString())

    remoteControl.undoButtonWasPushed()


}