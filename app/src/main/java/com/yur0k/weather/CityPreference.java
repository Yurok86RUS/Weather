package com.yur0k.weather;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    private static final String KEY = "city";
    private static final String KHANTY = "Khanty-Mansiysk";
    private SharedPreferences userPreference;

    public CityPreference(Activity activity) {
        userPreference = activity.getPreferences(Activity.MODE_PRIVATE);
    }


    String getCity() {
        return userPreference.getString(KEY, KHANTY);
    }

    void setCity(String city){
        userPreference.edit().putString(KEY, city).apply();
    }
}
