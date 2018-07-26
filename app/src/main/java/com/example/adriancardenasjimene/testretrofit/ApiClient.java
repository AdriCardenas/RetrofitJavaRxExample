package com.example.adriancardenasjimene.testretrofit;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

public class ApiClient implements ApiService {
    private Retrofit retrofit;

    private Retrofit getClient(String baseUrl) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


    @Override
    public Observable<List<Hero>> getHeroes() {
        ApiService apiService = getClient(ApiService.BASE_URL).create(ApiService.class);
        return apiService.getHeroes();
    }
}
