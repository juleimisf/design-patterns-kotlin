package patternObserver.chartsExample

class EditorChart {

    private val listener: ChartListener? = null
    private val listOfObservers: ArrayList<ChartListener> = ArrayList()
    private var model = CharModel(11f, 11f, 11f)

    fun subscribe(observer: ChartListener) {
        listOfObservers.add(observer)
    }

    fun unsubscribe(observer: ChartListener){
        listOfObservers.remove(observer)
    }

    fun setNewValue(data: CharModel) {
        model = data
        notifyAllObservers()
    }

    private fun notifyAllObservers(){
        listOfObservers.forEach {
           it.notify(model)
        }
    }
}