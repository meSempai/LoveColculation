package com.example.lovecolculation.remote

import com.example.lovecolculation.remote.LoveModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun percentageNames(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key:String = "1261b8744dmshe79509d3cdbf87dp1ee86fjsndf5e432424d8",
        @Header("X-RapidAPI-Host") host:String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}