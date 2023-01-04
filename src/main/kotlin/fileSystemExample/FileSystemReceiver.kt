package fileSystemExample

interface FileSystemReceiver {
    fun openFile()
    fun writeFile()
    fun closeFile()
}