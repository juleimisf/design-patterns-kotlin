package command.orderExample


class BrokerInvoker {
    private var orderList = mutableListOf<OrderCommand>()
    fun takeOrder(order : OrderCommand){
        orderList.add(order)

    }
    fun placeOrders(){
        for (order in orderList){
           order.execute()
        }
        orderList.clear()

    }
}