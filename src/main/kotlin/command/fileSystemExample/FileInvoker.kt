package command.fileSystemExample

class FileInvoker(private val command : Command) {
    fun run(){
        command.execute()
    }
}