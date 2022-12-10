package patternFactory.currencyExample

class ChileanPeso : ICurrency {
    override fun symbol() = "$"

    override fun code() = "CLP"
}