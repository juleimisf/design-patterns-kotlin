package command.orderExample

class ConcreteSellStockCommand(private val stock: StockReceiver) : OrderCommand {
    override fun execute() {
        stock.sell()
    }
}