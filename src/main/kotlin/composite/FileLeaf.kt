package composite

class FileLeaf(private val size : Int) : FileSystemComponent {
    override fun getsize(): Int {
        return size
    }
}