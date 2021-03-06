// Generated by Dagger (https://dagger.dev).
package com.example.basemvvm.ui.splash;

import com.example.basemvvm.data.repository.ApiRepository;
import com.example.basemvvm.ui.base.BaseViewModel_MembersInjector;
import dagger.MembersInjector;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashViewModel_MembersInjector implements MembersInjector<SplashViewModel> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public SplashViewModel_MembersInjector(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  public static MembersInjector<SplashViewModel> create(
      Provider<ApiRepository> apiRepositoryProvider) {
    return new SplashViewModel_MembersInjector(apiRepositoryProvider);}

  @Override
  public void injectMembers(SplashViewModel instance) {
    BaseViewModel_MembersInjector.injectApiRepository(instance, apiRepositoryProvider.get());
  }
}
