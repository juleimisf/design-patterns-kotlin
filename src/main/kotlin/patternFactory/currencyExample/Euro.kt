package patternFactory.currencyExample

class Euro : ICurrency {
    override fun symbol() = "€"

    override fun code() = "EUR"
}