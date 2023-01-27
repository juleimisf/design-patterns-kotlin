package command.fileSystemExample

class ConcreteOpenFileCommand(private val receiver : FileSystemReceiver) : Command {
    override fun execute() {
        receiver.openFile()
    }
}