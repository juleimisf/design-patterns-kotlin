package command.wheaterExample

class RemoteControlInvoker(
    private val listOfCommand: MutableList<Command>,
    private val listOfOffCommand: MutableList<Command>,
) {

    fun setCommand(slot: Int, command: Command, offCommand: Command) {
        listOfCommand[slot] = command
        listOfOffCommand[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        listOfCommand[slot].execute()
    }

    fun offButtonWasPushed(slot: Int) {
        listOfOffCommand[slot].execute()
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