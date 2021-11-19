package com.example.movies.networking

import com.example.movies.models.MovieResponse

class RemoteApi(private val apiService: RemoteApiService) {
    val key ="5957fcf3ba81b137f8fc01ac5a31fb5"
    val lenguage= "em-Us"

    suspend fun getMovies(): Result<MovieResponse> = try {
        val data = apiService.getMovies()
        Success(data)
    } catch (error: Throwable) {
        Failure(error)
    }

    suspend fun getMoviesByPage(page:Int): Result<MovieResponse> = try {
        val data = apiService.getMoviesByPage(page,key,lenguage)
        Success(data)
    }catch (error: Throwable) {
        Failure(error)
    }

}