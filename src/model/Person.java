package model;

import java.util.Arrays;

public class Person implements Comparable<Person>, Cloneable {
    private String name;
    private String country;
    private int birthYear;


    public Person() {
    }

    @Override
    public int compareTo(Person person) {
        if (birthYear > person.birthYear) {
            return 1;
        } else {
            if (birthYear < person.birthYear) {
                return -1;
            }
            return 0;
        }

    }

    public Person(String name, String country, int birthYear) {
        this.name = name;
        this.country = country;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


}


////клон преднозначен для создания точной копии объета на котором вызывается этот метод
//// при клонировании объета этим методом не вызываются конструкторы и блоки кода



