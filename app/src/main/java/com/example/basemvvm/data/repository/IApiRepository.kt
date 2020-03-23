package com.example.basemvvm.data.repository

import com.example.basemvvm.data.model.ApiObjectResponse
import com.example.basemvvm.data.model.CategoryResponse
import io.reactivex.Single
import retrofit2.http.GET

interface IApiRepository {

    @GET("listCategories")
    fun getListCategory(): Single<ApiObjectResponse<CategoryResponse>>

}