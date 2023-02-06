package composite

class DirectoryComposite(private val components: MutableList<FileSystemComponent> = mutableListOf()) :
    FileSystemComponent {
    override fun getsize(): Int {
        return components.sumOf { it.getsize() }
    }

    fun add(component: FileSystemComponent) {
        components.add(component)
    }

    fun remove(component: FileSystemComponent) {
        components.remove(component)
    }
}