package com.example.weatherapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherAPI {

    @GET("weather?appid=fe6ee9f358f499c7a601a54a408aa04d&units=metric")
    Call<OpenWeatherMap>getWeatherWithLocation(@Query("lat")double lat, @Query("lon")double lon);

    @GET("weather?appid=fe6ee9f358f499c7a601a54a408aa04d&units=metric")
    Call<OpenWeatherMap>getWeatherWithCityName(@Query("q")String name);
}
