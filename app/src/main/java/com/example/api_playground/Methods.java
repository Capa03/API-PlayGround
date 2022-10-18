package com.example.api_playground;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Methods {

    @GET("people/")
    Call<ApiResponse> getAllData(@Query("page") String page,
                                 @Query("format") String format);
}
