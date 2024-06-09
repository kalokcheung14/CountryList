package com.example.countrylist.repositories

import com.example.countrylist.models.Country

class DummyCountryRepository: CountryRepository {
    override fun getCountryList(): List<Country> {
        return listOf(
            Country(
                name = "Canada",
                code = "CA",
                emoji = "🇨🇦"
            ),
            Country(
                name = "United States",
                code = "US",
                emoji = "🇺🇸"
            ),
            Country(
                name = "United Kingdom",
                code = "UK",
                emoji = "🇬🇧"
            ),
        )
    }
}