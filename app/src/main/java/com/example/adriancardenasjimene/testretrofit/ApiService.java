package com.example.adriancardenasjimene.testretrofit;

import java.util.List;

import retrofit2.http.GET;
import rx.Observable;

public interface ApiService {
    String BASE_URL = "https://simplifiedcoding.net/demos/";

    @GET("marvel")
    Observable<List<Hero>> getHeroes();
}
