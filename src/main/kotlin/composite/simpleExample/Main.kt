package composite.simpleExample

fun main() {
    val directory = DirectoryComposite()
    val file1 = FileLeaf(1)
    val file2 = FileLeaf(2)
    val file3 = FileLeaf(3)
    val file4 = FileLeaf(4)

    directory.add(file1)
    directory.add(file2)
    directory.add(file3)
    directory.add(file4)

    println("Size of  File is: ${directory.getsize()}")

}