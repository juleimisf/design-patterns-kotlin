package patternObserver.chartsExample

fun main(args: Array<String>) {
    val editor = EditorChart()

    val pieChart = PieObserveView()
    val barChart = BarObserveView()
    val tableChart = TableObserveView()

    editor.subscribe(pieChart)
    editor.subscribe(barChart)
    editor.subscribe(tableChart)

    editor.setNewValue(CharModel(01f, 02f, 03f))
    editor.unsubscribe(barChart)
    editor.setNewValue(CharModel(33f, 44f, 66f))

}