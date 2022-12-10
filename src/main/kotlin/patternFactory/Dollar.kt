package patternFactory

class Dollar : ICurrency {
    override fun symbol() = "$"

    override fun code() = "USD"
}