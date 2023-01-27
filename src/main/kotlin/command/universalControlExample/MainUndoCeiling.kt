package command.universalControlExample

import command.universalControlExample.undo.NoCommand
import command.universalControlExample.undo.RemoteControlWithUndoInvoker

fun main() {
    val ceiling = CeilingFan()
    val ceilingHigh = CeilingFanHighCommand(ceiling)
    val ceilingMedium = CeilingFanMediumCommand(ceiling)
    val ceilingOff = CeilingFanOffCommand(ceiling)


    val listOfOnCommand = mutableListOf(ceilingHigh,ceilingMedium)
    val listOfOffCommand = mutableListOf(ceilingOff, ceilingOff)

    val noCommand = NoCommand()
    var remoteControl = RemoteControlWithUndoInvoker(
        listOfOnCommand.toMutableList(),
        listOfOffCommand.toMutableList(), noCommand
    )

    remoteControl.setCommand(0, ceilingMedium, ceilingOff)
    remoteControl.setCommand(1, ceilingHigh, ceilingOff)


    remoteControl.onButtonWasPushed(0)
    remoteControl.offButtonWasPushed(0)

    println(remoteControl.printToString())

    remoteControl.undoButtonWasPushed()

    remoteControl.onButtonWasPushed(1)

    println(remoteControl.printToString())

    remoteControl.undoButtonWasPushed()


}