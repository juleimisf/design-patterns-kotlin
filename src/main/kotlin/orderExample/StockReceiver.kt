package orderExample

class StockReceiver {
    val name = "ABC"
    val quantity = 10

    fun buy(){
        println("Stock [ Name: $name Quantity: $quantity] bought")
    }

    fun sell(){
        println("Stock [ Name: $name Quantity: $quantity] sold")
    }
}