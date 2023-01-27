package command.orderExample

fun main(args : Array<String>) {
    var receiver = StockReceiver()

    val buy = ConcreteBuyStockCommand(receiver)
    val sell = ConcreteSellStockCommand(receiver)

    val invoker = BrokerInvoker()
    invoker.takeOrder(buy)
    invoker.takeOrder(sell)

    invoker.placeOrders()

}