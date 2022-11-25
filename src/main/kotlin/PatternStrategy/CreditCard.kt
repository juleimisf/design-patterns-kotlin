package PatternStrategy

class CreditCard internal constructor(private val number: String,
                                      private val date: String,
                                      private val cvv: String) {
    var amount = 100000
}