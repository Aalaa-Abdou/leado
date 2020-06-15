package com.example.leado.remote;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    private static Retrofit retrofit;

    public static Retrofit getRetrofit() {
        if (retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl("https://www.googleapis.com/youtube/v3/").addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient.Builder().build()).build();
        }
        return retrofit;
    }
}
