package orderExample

class ConcreteBuyStockCommand(private val stock: StockReceiver) : OrderCommand {
    override fun execute() {
        stock.buy()
    }
}