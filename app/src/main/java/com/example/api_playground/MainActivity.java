package com.example.api_playground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
    private AdapterView adapterView = new AdapterView();
    private String FIRST_REQUEST = "https://swapi.dev/api/people/?page=1&format=json";
    private Uri uri;
    private Methods methods;
    private String next;
    private String previous;
    private Context context = this;
    private Button btNext;
    private Button btPrevious;
    private boolean enable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.cacheViews();
        this.methods = RetrofitClient.getRetrofitInstance().create(Methods.class);

        btNext.setEnabled(true);
        btPrevious.setEnabled(false);

        BackGroundTasks.execute(new Runnable() {
            @Override
            public void run() {
                Call<ApiResponse> call = methods.getAllData(getPageNumber(FIRST_REQUEST), "json");
                try {
                    ApiResponse api = call.execute().body();
                    List<Person> personList = api.getPersons();
                    next = api.getNext();
                    previous = api.getPrevious();
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

    private void cacheViews() {
        this.btNext = findViewById(R.id.nextButton);
        this.btPrevious = findViewById(R.id.requestButton);
    }

    private String getPageNumber(String url) {
        this.uri = Uri.parse(url);
        return uri.getQueryParameter("page");
    }

    public void onNext(View view) {

        BackGroundTasks.execute(new Runnable() {
            @Override
            public void run() {


                Call<ApiResponse> call = methods.getAllData(getPageNumber(next), "json");
                try {
                    ApiResponse api = call.execute().body();
                    List<Person> personList = api.getPersons();
                    next = api.getNext();
                    previous = api.getPrevious();

                    enable = next != null;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            btNext.setEnabled(enable);
                            btPrevious.setEnabled(true);
                            adapterView.updateList(personList);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }

    public void onPrevious(View view) {

        BackGroundTasks.execute(new Runnable() {
            @Override
            public void run() {

                Call<ApiResponse> call = methods.getAllData(getPageNumber(previous), "json");

                try {
                    ApiResponse api = call.execute().body();
                    List<Person> personList = api.getPersons();
                    next = api.getNext();
                    previous = api.getPrevious();
                    enable = previous != null;

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            btNext.setEnabled(true);
                            btPrevious.setEnabled(enable);
                            adapterView.updateList(personList);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();

                }

            }
        });

    }
}