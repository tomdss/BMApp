package com.example.basemvvm.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/basemvvm/data/repository/IApiRepository;", "", "getListCategory", "Lio/reactivex/Single;", "Lcom/example/basemvvm/data/model/ApiObjectResponse;", "Lcom/example/basemvvm/data/model/CategoryResponse;", "getListPopular", "Lcom/example/basemvvm/data/model/movie/MoviePopular;", "apiKey", "", "app_debug"})
public abstract interface IApiRepository {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "listCategories")
    public abstract io.reactivex.Single<com.example.basemvvm.data.model.ApiObjectResponse<com.example.basemvvm.data.model.CategoryResponse>> getListCategory();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "movie/popular")
    public abstract io.reactivex.Single<com.example.basemvvm.data.model.movie.MoviePopular> getListPopular(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "api_key")
    java.lang.String apiKey);
}