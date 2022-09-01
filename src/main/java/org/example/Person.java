package org.example;

import java.time.LocalDate;

public class Person extends AbstractPerson {
    public Person(String name, String surname, int year, String country, String town, String street, Integer house) {
        super(name, surname, LocalDate.ofEpochDay(year), country, town, street, house);
    }
}

