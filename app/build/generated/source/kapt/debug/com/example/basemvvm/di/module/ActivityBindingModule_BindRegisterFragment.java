package com.example.basemvvm.di.module;

import com.example.basemvvm.ui.register.RegisterFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBindingModule_BindRegisterFragment.RegisterFragmentSubcomponent.class
)
public abstract class ActivityBindingModule_BindRegisterFragment {
  private ActivityBindingModule_BindRegisterFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RegisterFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RegisterFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RegisterFragmentSubcomponent extends AndroidInjector<RegisterFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RegisterFragment> {}
  }
}
