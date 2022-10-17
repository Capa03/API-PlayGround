package com.example.api_playground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
    private AdapterView adapterView = new AdapterView();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Methods methods = RetrofitClient.getRetrofitInstance().create(Methods.class);
        Call<ApiResponse> call = methods.getAllData();

        BackGroundTasks.execute(new Runnable() {
            @Override
            public void run() {

                try {
                    List<Person> personList = call.execute().body().getPersons();
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adapterView.updateList(personList);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });


        RecyclerView recyclerView = findViewById(R.id.Recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapterView);
        recyclerView.setLayoutManager(layoutManager);


    }
}