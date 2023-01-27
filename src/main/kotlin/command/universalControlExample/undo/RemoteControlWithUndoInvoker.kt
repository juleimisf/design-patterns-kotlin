package command.universalControlExample.undo

import command.universalControlExample.Command


class RemoteControlWithUndoInvoker(
    private val listOfCommand: MutableList<Command>,
    private val listOfOffCommand: MutableList<Command>,
    private var undoCommand : Command
) {

    fun setCommand(slot: Int, command: Command, offCommand: Command) {
        listOfCommand[slot] = command
        listOfOffCommand[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        listOfCommand[slot].execute()
        undoCommand =  listOfCommand[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        listOfOffCommand[slot].execute()
        undoCommand =  listOfOffCommand[slot]

    }

    fun undoButtonWasPushed(){
        undoCommand.undo()
    }

    fun printToString(): String {
        var stringBuffer = StringBuffer()
        stringBuffer.append("\n------ Remote Control -------\n”")
        for (i in listOfCommand.indices) {
            stringBuffer.append("[Slot $i] ${listOfCommand[i].javaClass.name}  ${listOfOffCommand[i].javaClass.name}\n")
        }
        return stringBuffer.toString()
    }

}