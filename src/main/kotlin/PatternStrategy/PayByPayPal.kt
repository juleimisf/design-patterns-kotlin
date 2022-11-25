package PatternStrategy

class PayByPayPal : PayStrategy {
    var email: String = ""
    var password: String = ""

    override fun pay(paymentAmount: Int): Boolean {
        println("Paying $paymentAmount using PayPal.")
        return true
    }

    override fun collectPaymentDetails() {
        print("Enter the user's email: ")
        email = readLine() ?: ""
        print("Enter the password: ")

        password = readLine() ?: ""
        if (validateCredentials()) {
            println("Data verification has been successful.")
        } else {
            println("Wrong email or password!");

        }
    }

    private fun validateCredentials() = email.isNotEmpty() && password.isNotEmpty()
}