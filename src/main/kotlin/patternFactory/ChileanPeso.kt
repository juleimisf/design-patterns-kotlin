package patternFactory

class ChileanPeso : ICurrency {
    override fun symbol() = "$"

    override fun code() = "CLP"
}