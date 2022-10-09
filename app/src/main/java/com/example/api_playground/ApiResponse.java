package com.example.api_playground;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse {

    private int count;
    @SerializedName("results")
    private List<Person> persons;

    public ApiResponse(int count, List<Person> persons){
        this.count = count;
        this.persons = persons;
    }

    public int getCount() {
        return count;
    }

    public List<Person> getPersons() {
        return persons;
    }
}
