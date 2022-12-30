package com.ait.weather.di;

import com.ait.weather.weather_climate.WeatherClimateActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityModule_ContributeWeatherActivity.WeatherClimateActivitySubcomponent.class
)
public abstract class ActivityModule_ContributeWeatherActivity {
  private ActivityModule_ContributeWeatherActivity() {}

  @Binds
  @IntoMap
  @ClassKey(WeatherClimateActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      WeatherClimateActivitySubcomponent.Builder builder);

  @Subcomponent(modules = ViewModelModule.class)
  public interface WeatherClimateActivitySubcomponent
      extends AndroidInjector<WeatherClimateActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<WeatherClimateActivity> {}
  }
}
