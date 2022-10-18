package com.example.api_playground;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ApiResponse {

    private int count;
    @SerializedName("results")
    private List<Person> persons = new ArrayList<>();
    private String next;
    private String previous;

    public ApiResponse(int count, List<Person> persons, String next, String previous) {
        this.count = count;
        this.persons = persons;
        this.next = next;
        this.previous = previous;
    }

    public int getCount() {
        return count;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }
}
