package com.example.jaime.retrofitpoc.model.api;

import com.example.jaime.retrofitpoc.model.PokemonFeed;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestClient {
    @GET("pokemon")
    Call<PokemonFeed> getData();

}