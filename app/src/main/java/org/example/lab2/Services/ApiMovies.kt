package org.example.lab2.Services

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiMovies {

    @GET("/IvanchukM/MT-lab1/master/jsonformatter.json")
    fun getMovies() : Observable<MovieResponse>
}