package patternObserver.chartsExample

class PieObserveView : ChartListener {
    override fun notify(data: CharModel) {
        println("Showing the pie chart view for params ${data.a}, ${data.b}, ${data.c}")
    }
}