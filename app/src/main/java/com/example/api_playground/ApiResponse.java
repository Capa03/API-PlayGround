package com.example.api_playground;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    private int count;
    @SerializedName("results")
    private List<Person> persons;
    private String height;
    @SerializedName("birth_year")
    private String birthYear;
    private String gender;

    public ApiResponse(int count, List<Person> persons, String height, String birthYear, String gender) {
        this.count = count;
        this.persons = persons;
        this.height = height;
        this.birthYear = birthYear;
        this.gender = gender;
    }

    public int getCount() {
        return count;
    }

    public List<Person> getPersons() {
        return persons;
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
