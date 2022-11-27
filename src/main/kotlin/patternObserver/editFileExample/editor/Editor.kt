package patternObserver.editFileExample.editor

import patternObserver.editFileExample.publisher.EventManager
import java.io.File

class Editor {
    var events: EventManager = EventManager("hola")
    private var file: File? = null

    fun openFile(filePath: String?) {
        file = File(filePath)
        events.notify("open", file)
    }

    @Throws(Exception::class)
    fun saveFile() {
        if (file != null) {
            events.notify("save", file)
        } else {
            throw Exception("Please open a file first.")
        }
    }
}