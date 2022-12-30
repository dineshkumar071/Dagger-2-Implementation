// Generated by Dagger (https://google.github.io/dagger).
package com.ait.weather.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class ApiModule_ProvideGsonFactory implements Factory<Gson> {
  private final ApiModule module;

  public ApiModule_ProvideGsonFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideInstance(module);
  }

  public static Gson provideInstance(ApiModule module) {
    return proxyProvideGson(module);
  }

  public static ApiModule_ProvideGsonFactory create(ApiModule module) {
    return new ApiModule_ProvideGsonFactory(module);
  }

  public static Gson proxyProvideGson(ApiModule instance) {
    return Preconditions.checkNotNull(
        instance.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}