package patternObserver

import patternObserver.editFileExample.editor.Editor
import patternObserver.editFileExample.observers.EmailNotificationListener
import patternObserver.editFileExample.observers.LogOpenListener


fun main(args: Array<String>) {
    val editor = Editor()

    editor.events.subscribe("open",  LogOpenListener("/path/to/log/file.txt"))
    editor.events.subscribe("save",  EmailNotificationListener("admin@example.com"))

    try {
        editor.openFile("test.txt")
        editor.saveFile()
    } catch (e: Exception) {
        e.printStackTrace()
    }

}
