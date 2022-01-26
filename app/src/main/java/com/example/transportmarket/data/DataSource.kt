package com.example.transportmarket.data

import com.example.transportmarket.R

class DataSource {


    fun loadAnnouncementInformations(): List<AnnouncementInformations> {
        val listOfCars = listOf<AnnouncementInformations>(
                AnnouncementInformations("mercedes-benz", "citan", 2018, 90, 1461, 100, R.drawable.o01, false),
                AnnouncementInformations("mercedes-benz", "sprinter", 2015, 160, 2200, 377, R.drawable.o02, false),
                AnnouncementInformations("mercedes-benz", "sprinter", 2020, 190, 2987, 510, R.drawable.o03, true),
                AnnouncementInformations("mercedes-benz", "sprinter", 2016, 163, 2143, 450, R.drawable.o03, false),
                AnnouncementInformations("mercedes-benz", "sprinter", 2008, 150, 2148, 220, R.drawable.o04, false),
                AnnouncementInformations("mercedes-benz", "sprinter", 2021, 190, 2987, 600, R.drawable.o05, true),
                AnnouncementInformations("mercedes-benz", "sprinter", 2021, 190, 2987, 650, R.drawable.o06, true),
                AnnouncementInformations("opel", "movano", 2020, 160, 2300, 379, R.drawable.o07, true),
                AnnouncementInformations("opel", "zafira", 2020, 177, 1997, 270, R.drawable.o08, true),
                AnnouncementInformations("opel", "movano", 2021, 136, 2300, 340, R.drawable.o09, false),
                AnnouncementInformations("opel", "blitz", 1973, 87, 2500, 130, R.drawable.o11, true),
                AnnouncementInformations("opel", "vivaro", 2018, 121, 1598, 190, R.drawable.o12, false),
                AnnouncementInformations("opel", "combo", 1012, 105, 1598, 155, R.drawable.o13, false),
                AnnouncementInformations("opel", "vivaro", 2017, 145, 1598, 220, R.drawable.o14, false),
                AnnouncementInformations("Volkswagen", "caddy", 2014, 102, 1598, 135, R.drawable.o15, false),
                AnnouncementInformations("Volkswagen", "crafter", 2011, 140, 2298, 338, R.drawable.o16, false),
                AnnouncementInformations("Volkswagen", "crafter", 2016, 136, 1968, 290, R.drawable.o17, false),
                AnnouncementInformations("Volkswagen", "caddy", 2015, 75, 1968, 95, R.drawable.o18, false),
                AnnouncementInformations("Volkswagen", "caddy", 2021, 75, 1598, 110, R.drawable.o19, false),
                AnnouncementInformations("Volkswagen", "transporter", 2004, 65, 1900, 77, R.drawable.o20, false),
                AnnouncementInformations("Volkswagen", "transporter", 2021, 150, 1998, 345, R.drawable.o21, true),
                AnnouncementInformations("Volkswagen", "crafter", 2021, 177, 1998, 510, R.drawable.o22, true),
                AnnouncementInformations("Volkswagen", "caravelle", 2021, 150, 1998, 420, R.drawable.o23, true),
                AnnouncementInformations("Volkswagen", "multivan", 2021, 150, 1998, 470, R.drawable.o24, true),
                AnnouncementInformations("fiat", "doblo", 2014, 85, 1300, 115, R.drawable.o25, false),
                AnnouncementInformations("fiat", "ducato", 2009, 100, 2198, 135, R.drawable.o26, false),
                AnnouncementInformations("fiat", "ducato", 2018, 130, 2300, 143, R.drawable.o27, false),
                AnnouncementInformations("fiat", "ducato", 2003, 120, 2300, 123, R.drawable.o28, false),
                AnnouncementInformations("fiat", "kamper", 2017, 160, 2700, 720, R.drawable.o29, true),
                AnnouncementInformations("fiat", "ducato", 2006, 100, 2198, 170, R.drawable.o30, false),
        )

            return listOfCars
    }

    fun loadPicturesData(): List<Int> {
        val listOfPictureCars = listOf<Int>(
                R.drawable.o01,
                R.drawable.o02,
                R.drawable.o03,
                R.drawable.o04,
                R.drawable.o05,
                R.drawable.o06,
                R.drawable.o07,
                R.drawable.o08,
                R.drawable.o09,
                R.drawable.o10,
                R.drawable.o11,
                R.drawable.o12,
                R.drawable.o13,
                R.drawable.o14,
                R.drawable.o15,
                R.drawable.o16,
                R.drawable.o17,
                R.drawable.o18,
                R.drawable.o19,
                R.drawable.o20,
                R.drawable.o21,
                R.drawable.o22,
                R.drawable.o23,
                R.drawable.o24,
                R.drawable.o25,
                R.drawable.o26,
                R.drawable.o27,
                R.drawable.o28,
                R.drawable.o29,
                R.drawable.o30,
        )
        return listOfPictureCars
    }
}