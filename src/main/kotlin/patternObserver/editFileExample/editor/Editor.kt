package patternObserver.editFileExample.editor

import patternObserver.editFileExample.publisher.EventManager
import java.io.File

class Editor {
    var events: EventManager = EventManager("open", "save")
    private var file: File? = null

    fun openFile(filePath: String?) {
        file = File(filePath)
        events.notify("open", file)
    }

    fun saveFile() {
        file?.let {
            events.notify("save", file)
        }
    }
}