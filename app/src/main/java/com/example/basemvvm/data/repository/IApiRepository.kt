package com.example.basemvvm.data.repository

import com.example.basemvvm.data.model.ApiObjectResponse
import com.example.basemvvm.data.model.CategoryResponse
import com.example.basemvvm.data.model.movie.MoviePopular
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface IApiRepository {

    @GET("listCategories")
    fun getListCategory(): Single<ApiObjectResponse<CategoryResponse>>

    @GET("movie/popular")
    fun getListPopular(@Query("api_key") apiKey: String): Single<MoviePopular>

}