package state.mediaPlayerExample

fun main() {
    val context = Context()

    println(context.getState()?.onPlay())
    println(context.getState()?.onNext())
    println(context.getState()?.onNext())
    println(context.getState()?.onPause())
    println(context.getState()?.onPlay())
    println(context.getState()?.onPlay())
    println(context.getState()?.onNext())
    println(context.getState()?.onNext())
    println(context.getState()?.onNext())
    println(context.getState()?.onPrevious())
    println(context.getState()?.onPause())
    println(context.getState()?.onNext())

}