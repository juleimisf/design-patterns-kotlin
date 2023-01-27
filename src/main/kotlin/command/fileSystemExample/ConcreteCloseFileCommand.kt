package command.fileSystemExample

class ConcreteCloseFileCommand(private val receiver : FileSystemReceiver) : Command {
    override fun execute() {
        receiver.closeFile()
    }
}