package PatternStrategy

interface PayStrategy {
    fun pay(paymentAmount: Int): Boolean
    fun collectPaymentDetails()
}