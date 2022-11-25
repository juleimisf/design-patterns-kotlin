package PatternStrategy

class PayByCash : PayStrategy {
    var name: String = ""

    override fun pay(paymentAmount: Int): Boolean {
        println("Paying $paymentAmount using Cash.")
        return true
    }

    override fun collectPaymentDetails() {
        print("Enter the user's name: ")
        name = readLine() ?: ""
        if (validateCredentials()) {
            println("Data verification has been successful.")
        } else {
            println("Wrong name!");

        }
    }

    private fun validateCredentials() = name.isNotEmpty()
}