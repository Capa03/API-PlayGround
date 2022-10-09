package com.example.api_playground;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String response = DataSource.getPersonList();

        Gson gson = new Gson();
        ApiResponse apiResponse = gson.fromJson(response,ApiResponse.class);
        Log.i("MainActivity", gson.toJson(apiResponse));
        //apiResponse.getPersons();
    }
}