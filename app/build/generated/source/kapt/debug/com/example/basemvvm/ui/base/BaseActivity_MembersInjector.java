// Generated by Dagger (https://dagger.dev).
package com.example.basemvvm.ui.base;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector<T extends ViewDataBinding, M extends BaseViewModel> implements MembersInjector<BaseActivity<T, M>> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public BaseActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static <T extends ViewDataBinding, M extends BaseViewModel> MembersInjector<BaseActivity<T, M>> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new BaseActivity_MembersInjector<T, M>(androidInjectorProvider, viewModelFactoryProvider);}

  @Override
  public void injectMembers(BaseActivity<T, M> instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.example.basemvvm.ui.base.BaseActivity.viewModelFactory")
  public static <T extends ViewDataBinding, M extends BaseViewModel> void injectViewModelFactory(
      BaseActivity<T, M> instance, ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
