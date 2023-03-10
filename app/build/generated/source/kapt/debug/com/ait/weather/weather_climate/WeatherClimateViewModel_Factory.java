// Generated by Dagger (https://google.github.io/dagger).
package com.ait.weather.weather_climate;

import android.app.Application;
import com.ait.weather.Repository.ApiCall;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class WeatherClimateViewModel_Factory implements Factory<WeatherClimateViewModel> {
  private final Provider<Application> mApplicationProvider;

  private final Provider<ApiCall> apiCallProvider;

  public WeatherClimateViewModel_Factory(
      Provider<Application> mApplicationProvider, Provider<ApiCall> apiCallProvider) {
    this.mApplicationProvider = mApplicationProvider;
    this.apiCallProvider = apiCallProvider;
  }

  @Override
  public WeatherClimateViewModel get() {
    return provideInstance(mApplicationProvider, apiCallProvider);
  }

  public static WeatherClimateViewModel provideInstance(
      Provider<Application> mApplicationProvider, Provider<ApiCall> apiCallProvider) {
    return new WeatherClimateViewModel(mApplicationProvider.get(), apiCallProvider.get());
  }

  public static WeatherClimateViewModel_Factory create(
      Provider<Application> mApplicationProvider, Provider<ApiCall> apiCallProvider) {
    return new WeatherClimateViewModel_Factory(mApplicationProvider, apiCallProvider);
  }

  public static WeatherClimateViewModel newWeatherClimateViewModel(
      Application mApplication, ApiCall apiCall) {
    return new WeatherClimateViewModel(mApplication, apiCall);
  }
}
