// Generated by Dagger (https://dagger.dev).
package com.example.basemvvm.data.repository;

import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiRepository_Factory implements Factory<ApiRepository> {
  private final Provider<IApiRepository> apiRepositoryProvider;

  public ApiRepository_Factory(Provider<IApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public ApiRepository get() {
    return newInstance(apiRepositoryProvider.get());
  }

  public static ApiRepository_Factory create(Provider<IApiRepository> apiRepositoryProvider) {
    return new ApiRepository_Factory(apiRepositoryProvider);
  }

  public static ApiRepository newInstance(IApiRepository apiRepository) {
    return new ApiRepository(apiRepository);
  }
}
