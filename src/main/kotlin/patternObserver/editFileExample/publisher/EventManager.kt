package patternObserver.editFileExample.publisher

import patternObserver.EventListener
import java.io.File


class EventManager(private val operation: String) {
    private var listeners: HashMap<String, ArrayList<EventListener>> = HashMap()

    init {
        listeners.put(operation, arrayListOf())
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val observer = ArrayList<EventListener>()
        observer.add(listener)
        listeners.put(eventType, observer)
    }

    fun unsubscribe(eventType: String?, listener: EventListener) {
        listeners.remove(eventType)
    }

    fun notify(eventType: String?, file: File?) {
        val users: ArrayList<EventListener>? = listeners[eventType]

        users?.forEach {
            it.update(eventType!!, file!!)
        }
    }
}