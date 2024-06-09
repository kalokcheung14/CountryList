package com.example.countrylist.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.countrylist.models.Country
import com.example.countrylist.ui.theme.CountryListTheme
import com.example.countrylist.ui.theme.Typography

@Composable
fun CountryItem(country: Country, modifier: Modifier = Modifier) {
    Row (
        modifier = modifier
            .padding(32.dp, 16.dp)
    ) {
        Text(
            text = country.name ?: "",
            style = Typography.bodyLarge,
            modifier = Modifier.weight(0.7f)
        )
        Text(
            text = country.emoji ?: "",
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CountryListTheme {
        CountryItem(
            Country(
                name = "Canada",
                emoji = "🇨🇦"
            )
        )
    }
}