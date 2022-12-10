package patternFactory.currencyExample


object CurrencyFactory {

    fun currency(country: Country.CountryEnum): ICurrency? {
        return when (country) {
            Country.CountryEnum.SPAIN -> {
                Euro()
            }
            Country.CountryEnum.CHILE -> {

                ChileanPeso()
            }
            Country.CountryEnum.USA -> {
                Dollar()
            }
            else -> {
                null
            }
        }
    }
}