package com.example.api_playground;

import com.google.gson.annotations.SerializedName;

public class Person {
    private int number;

    @SerializedName("person_name")
    private String name;

    public Person(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
