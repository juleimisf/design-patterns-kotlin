package patternObserver.editFileExample.observers

import patternObserver.editFileExample.EventListener
import java.io.File

class LogOpenListener(var fileName : String) : EventListener {
    private val log = File(fileName)

    override fun update(eventType: String?, file: File?) {
        println("Save to log $log Someone has performed  $eventType operation with the following file: $ ${file?.name}");
    }
}