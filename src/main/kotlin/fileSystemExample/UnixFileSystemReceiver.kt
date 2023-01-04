package fileSystemExample

class UnixFileSystemReceiver : FileSystemReceiver {
    override fun openFile() {
        println("Opening file in unix OS")
    }

    override fun writeFile() {
        println("Writing file in unix OS")
    }

    override fun closeFile() {
        println("Closing file in unix OS")
    }
}