package com.myricseptember.countryfactcomposefinal.data.network

import com.myricseptember.countryfactcomposefinal.data.model.Country

class CountryInfoProvider {

    companion object {
        var countryList = initCountryList()

        private fun initCountryList(): MutableList<Country> {
            val countries = mutableListOf<Country>()
            countries.add(
                Country(
                    "Ghana",
                    "25.2 million",
                    "Accra - 1,970,400",
                    "Accra - 1,970,400",
                    "English, African languages including Akan, Ewe",
                    "Christianity, indigenous beliefs, Islam",
                    "Ghana cedi",
                    1
                )
            )
            countries.add(
                Country(
                    "South Africa",
                    "48.6 million",
                    "Johannesburg - 3,225,812",
                    "Pretoria (official) - est. 1,000,000",
                    "11 official languages including English, Afrikaans, Sesotho, Setswana, Xhosa and Zulu",
                    "Christianity, Islam, indigenous beliefs",
                    "rand",
                    2
                )
            )
            countries.add(
                Country(
                    "Zimbabwe",
                    "13.18 million",
                    "Harare - 1,184,169",
                    "Harare - 1,184,169",
                    "English (official), Shona, Sindebele",
                    "Christianity, indigenous beliefs",
                    "Zimbabwean dollar",
                    3
                )
            )
            countries.add(
                Country(
                    "Zambia",
                    "14.22 million",
                    "Lusaka - 1,391,000",
                    "Lusaka - 1,391,000",
                    "English (official), Bemba, Lozi, Nyanja, Tonga",
                    "Christianity, indigenous beliefs, Hinduism, Islam",
                    "Zambian kwacha",
                    4
                )
            )
            countries.add(
                Country(
                    "Egypts",
                    "85.29 million",
                    "Cairo - 7,010,000",
                    "Cairo - 7,010,000",
                    "Arabic",
                    "Islam, Christianity",
                    "Egyptian pound",
                    5
                )
            )
            countries.add(
                Country(
                    "Namibia",
                    "2.18 million",
                    "Windhoek - 161,000",
                    "Windhoek - 161,000",
                    "English (official), Afrikaans, German, Oshivambo, Herero, Nama",
                    "Christianity",
                    "Namibian dollar ; South African rand",
                    6
                )
            )
            countries.add(
                Country(
                    "Mozambique",
                    "24.1 million",
                    "Maputo - 1,095,300",
                    "Maputo - 1,095,300",
                    "Portuguese (official), several indigenous languages",
                    "Christianity, indigenous beliefs, Islam",
                    "metical",
                    7
                )
            )
            countries.add(
                Country(
                    "Lesotho",
                    "1.94 million",
                    "Maseru - 170,000,",
                    "Maseru - 170,000,",
                    "Sesotho, English",
                    "Christianity",
                    "loti ; South African rand",
                    8
                )
            )
            return countries
        }
    }
}