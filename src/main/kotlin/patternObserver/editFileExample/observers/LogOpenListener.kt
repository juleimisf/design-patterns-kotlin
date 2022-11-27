package patternObserver.editFileExample.observers

import patternObserver.EventListener
import java.io.File

class LogOpenListener(private val fileName : String) : EventListener {
    private val log = File(fileName)

    override fun update(eventType: String, file: File) {
        println("Save to log $log Someone has performed  $eventType operation with the following file: $ ${file.name}");
    }
}