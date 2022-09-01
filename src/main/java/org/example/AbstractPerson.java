package org.example;

import java.time.LocalDate;

public abstract class AbstractPerson {

    private static String name;
    private static String surname;
    private static LocalDate year;
    private static String country;
    private static String town;
    private static String street;
    private static Integer house;


    public AbstractPerson(String name, String surname, LocalDate year, String country, String town, String street, Integer house) {

    AbstractPerson.name = name;
    AbstractPerson.surname = surname;
    AbstractPerson.year = year;
    AbstractPerson.country = country;
    AbstractPerson.town = town;
    AbstractPerson.street = street;
    AbstractPerson. house = house;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                "year='" + year + '\'' +
                "country='" + country + '\'' +
                "toun='" + town + '\'' +
                "street='" + street + '\'' +
                "house='" + house + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public String getStreet() {
        return street;
    }
}