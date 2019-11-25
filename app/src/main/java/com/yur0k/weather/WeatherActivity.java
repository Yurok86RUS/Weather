package com.yur0k.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WeatherActivity extends AppCompatActivity {

    private static final String CHANGE_BUTTON_TEXT = "OK";
    private static final String WEATHER_FRAGMENT_TAG = "adaafafa-wedcczxcasc-565156d5s4csf";
    private CityPreference cityPreference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        cityPreference = new CityPreference(this);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container_for_fragment, new WeatherFragment(), WEATHER_FRAGMENT_TAG).commit();
        }
    }

}
