package command.fileSystemExample

class ConcreteWriteFileCommand(private val receiver : FileSystemReceiver) : Command {
    override fun execute() {
        receiver.writeFile()
    }
}