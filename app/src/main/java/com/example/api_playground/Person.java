package com.example.api_playground;

public class Person {

    private String name;
    private String height;
    private String birthYear;
    private String gender;

    public Person(String name, String height, String birthYear, String gender) {
        this.name = name;
        this.height = height;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }
}
