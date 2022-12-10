package patternFactory.currencyExample

class Dollar : ICurrency {
    override fun symbol() = "$"

    override fun code() = "USD"
}