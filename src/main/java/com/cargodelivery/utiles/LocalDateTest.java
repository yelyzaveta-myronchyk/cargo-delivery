package com.cargodelivery.utiles;

import com.cargodelivery.domain.Profile;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate someDate = LocalDate.of(2012,12,3 );
        LocalDate dateOfB = LocalDate.parse("19.08.2021", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println(currentDate);
        System.out.println(someDate);
        System.out.println(dateOfB);
        int years = Period.between(someDate, currentDate).getYears();
        System.out.println(years);
        Profile profile = new Profile(1, "Ivan", "Petrov", "fgfgfg", "1233333", "12.12.2000");
        System.out.println(profile);
    }
}
