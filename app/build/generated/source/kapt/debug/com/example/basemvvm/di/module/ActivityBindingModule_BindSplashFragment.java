package com.example.basemvvm.di.module;

import com.example.basemvvm.ui.splash.SplashFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_BindSplashFragment.SplashFragmentSubcomponent.class)
public abstract class ActivityBindingModule_BindSplashFragment {
  private ActivityBindingModule_BindSplashFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SplashFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SplashFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SplashFragmentSubcomponent extends AndroidInjector<SplashFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SplashFragment> {}
  }
}
