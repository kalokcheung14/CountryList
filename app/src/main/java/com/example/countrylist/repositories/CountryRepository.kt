package com.example.countrylist.repositories

import com.example.countrylist.models.Country

interface CountryRepository {
    fun getCountryList(): List<Country>
}