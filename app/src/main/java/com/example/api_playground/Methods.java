package com.example.api_playground;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("people?format=json")
    Call<ApiResponse> getAllData();
}
