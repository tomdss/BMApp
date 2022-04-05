package com.example.basemvvm.di.module;

import com.example.basemvvm.ui.signup.SignupFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBindingModule_BindSignupFragment.SignupFragmentSubcomponent.class)
public abstract class ActivityBindingModule_BindSignupFragment {
  private ActivityBindingModule_BindSignupFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SignupFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SignupFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SignupFragmentSubcomponent extends AndroidInjector<SignupFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SignupFragment> {}
  }
}
