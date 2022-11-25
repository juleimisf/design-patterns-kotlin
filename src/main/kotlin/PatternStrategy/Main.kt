package PatternStrategy

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    initOrder()
}

private fun initOrder() {

    val priceOnProducts: HashMap<Int, Int> = HashMap()
    var strategy: PayStrategy? = null

    priceOnProducts[1] = 2200
    priceOnProducts[2] = 1850
    priceOnProducts[3] = 1100
    priceOnProducts[4] = 890

    val reader = BufferedReader(InputStreamReader(System.`in`))

    val order = Order()

    if (!order.isClosed()) {
        var cost = 0
        var continueChoice = ""

        print(
            "Please, select a product:" + "\n" +
                    "1 - Mother board" + "\n" +
                    "2 - CPU" + "\n" +
                    "3 - HDD" + "\n" +
                    "4 - Memory" + "\n"
        )

        val choice: Int = reader.readLine().toInt()
        cost = priceOnProducts[choice] ?: 0

        print("Count: ")
        val count = reader.readLine().toInt()
        order.setTotalCost(cost * count)


        if (strategy == null) {
            println(
                "Please, select a payment method:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Credit Card" + "\n" +
                        "2 - Cash"
            )
            val paymentMethod = reader.readLine().toInt()

            strategy = when (paymentMethod) {
                1 -> {
                    PayByPayPal()
                }

                2 -> {
                    PayByCreditCard()
                }

                else -> {
                    PayByCash()

                }
            }
        }

        order.processOrder(strategy)
        print("Pay  ${order.getTotalCost()} units or Continue shopping? P/C: ")
        val proceed = reader.readLine()
        if (proceed.equals("P", ignoreCase = true)) {
            if (strategy.pay(order.getTotalCost())) {
                println("Payment has been successful.")
            } else {
                println("FAIL! Please, check your data.")
            }
            order.setClosed()
        }
    }
}