package patternObserver.chartsExample

class TableObserveView : ChartListener {
    override fun notify(data: CharModel) {
        println("Showing the table chart view for params ${data.a}, ${data.b}, ${data.c}")
    }
}