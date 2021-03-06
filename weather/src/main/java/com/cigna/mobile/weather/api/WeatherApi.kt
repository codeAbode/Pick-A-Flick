package com.cigna.mobile.weather.api

import com.cigna.mobile.db.WeatherContextResponse
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Url

interface WeatherApi{
    @GET("points/{lat},{lng}")
    fun getWeatherByLatLngAsync(@Path("lat") lat: Double,
                                @Path("lng") lng: Double): Call<JsonObject>
    @GET
    fun getWeatherForecast(@Url url: String): Call<WeatherContextResponse>
}