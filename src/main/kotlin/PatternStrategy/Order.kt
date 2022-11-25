package PatternStrategy

class Order {

    private var totalCost = 0
    private var isClosed = false

    fun processOrder(strategy: PayStrategy) {
        strategy.collectPaymentDetails()
    }

    fun setTotalCost(cost: Int) {
        totalCost += cost
    }

    fun getTotalCost(): Int {
        return totalCost
    }

    fun isClosed(): Boolean {
        return isClosed
    }

    fun setClosed() {
        isClosed = true
    }
}