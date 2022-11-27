package patternObserver.chartsExample

class BarObserveView : ChartListener {
    override fun notify(data: CharModel) {
        println("Showing the bar chart view for params ${data.a}, ${data.b}, ${data.c}")
    }
}