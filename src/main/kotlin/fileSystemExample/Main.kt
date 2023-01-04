package fileSystemExample

fun main() {

    val receiver = UnixFileSystemReceiver()
    //val receiver = WindowsFileSystemReceiver()

    val open = ConcreteOpenFileCommand(receiver)
    var invoker = FileInvoker(open)
    invoker.run()

    val write = ConcreteWriteFileCommand(receiver)
    invoker = FileInvoker(write)
    invoker.run()

    val close = ConcreteCloseFileCommand(receiver)
    invoker = FileInvoker(close)
    invoker.run()


}