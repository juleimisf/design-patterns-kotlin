package patternFactory

fun main(args: Array<String>) {

    val currency = CurrencyFactory.currency(Country.CountryEnum.SPAIN)
    val currencyUSD = CurrencyFactory.currency(Country.CountryEnum.USA)

    println("El código es: ${currency?.code()} y el simbolo es: ${currency?.symbol()}")
    println("El código es: ${currencyUSD?.code()} y el simbolo es: ${currencyUSD?.symbol()}")

}