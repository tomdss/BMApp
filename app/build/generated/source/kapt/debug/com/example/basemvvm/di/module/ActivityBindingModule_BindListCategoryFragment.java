package com.example.basemvvm.di.module;

import com.example.basemvvm.ui.list_category.ListCategoryFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_BindListCategoryFragment.ListCategoryFragmentSubcomponent.class
)
public abstract class ActivityBindingModule_BindListCategoryFragment {
  private ActivityBindingModule_BindListCategoryFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ListCategoryFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ListCategoryFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ListCategoryFragmentSubcomponent extends AndroidInjector<ListCategoryFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ListCategoryFragment> {}
  }
}
