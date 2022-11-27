package patternObserver

import patternObserver.editFileExample.editor.Editor
import patternObserver.editFileExample.observers.EmailNotificationListener
import patternObserver.editFileExample.observers.LogOpenListener


fun main(args: Array<String>) {
    val editor = Editor()

    val logListener = LogOpenListener("/path/to/log/file.txt")
    val emailListener = EmailNotificationListener("admin@example.com")

    editor.events.subscribe("open", logListener)
    editor.events.subscribe("open", emailListener)
    editor.events.subscribe("save", emailListener)

    editor.openFile("test.txt")
    editor.saveFile()

}
