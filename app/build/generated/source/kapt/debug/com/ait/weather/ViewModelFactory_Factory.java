// Generated by Dagger (https://google.github.io/dagger).
package com.ait.weather;

import android.app.Application;
import com.ait.weather.Repository.ApiCall;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiCall> creatorProvider;

  public ViewModelFactory_Factory(
      Provider<Application> mApplicationProvider, Provider<ApiCall> creatorProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.creatorProvider = creatorProvider;
  }

  @Override
  public ViewModelFactory get() {
    return provideInstance(mApplicationProvider, creatorProvider);
  }

  public static ViewModelFactory provideInstance(
      Provider<Application> mApplicationProvider, Provider<ApiCall> creatorProvider) {
    return new ViewModelFactory(mApplicationProvider.get(), creatorProvider.get());
  }

  public static ViewModelFactory_Factory create(
      Provider<Application> mApplicationProvider, Provider<ApiCall> creatorProvider) {
    return new ViewModelFactory_Factory(mApplicationProvider, creatorProvider);
  }

  public static ViewModelFactory newViewModelFactory(Application mApplication, ApiCall creator) {
    return new ViewModelFactory(mApplication, creator);
  }
}
