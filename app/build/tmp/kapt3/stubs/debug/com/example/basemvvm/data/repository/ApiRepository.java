package com.example.basemvvm.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/basemvvm/data/repository/ApiRepository;", "", "apiRepository", "Lcom/example/basemvvm/data/repository/IApiRepository;", "(Lcom/example/basemvvm/data/repository/IApiRepository;)V", "getListCategory", "Lio/reactivex/Single;", "Lcom/example/basemvvm/data/model/ApiObjectResponse;", "Lcom/example/basemvvm/data/model/CategoryResponse;", "getListPopular", "Lcom/example/basemvvm/data/model/movie/MoviePopular;", "app_debug"})
public final class ApiRepository {
    private final com.example.basemvvm.data.repository.IApiRepository apiRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.example.basemvvm.data.model.ApiObjectResponse<com.example.basemvvm.data.model.CategoryResponse>> getListCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.example.basemvvm.data.model.movie.MoviePopular> getListPopular() {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiRepository(@org.jetbrains.annotations.NotNull()
    com.example.basemvvm.data.repository.IApiRepository apiRepository) {
        super();
    }
}