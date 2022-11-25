package PatternStrategy


class PayByCreditCard : PayStrategy {
    private var cardData: CreditCard? = null
    override fun pay(paymentAmount: Int): Boolean {
        println("Paying $paymentAmount using Credit Card.");
        cardData?.amount = cardData?.amount!! - paymentAmount
        return true
    }

    override fun collectPaymentDetails() {
        print("Enter the card number: ")
        val number = readLine() ?: ""
        print("Enter the card expiration date 'mm/yy': ")
        val date = readLine() ?: ""
        print("Enter the CVV code: ")
        val cvv = readLine() ?: ""
        cardData = CreditCard(number, date, cvv)
    }
}