package com.yur0k.weather;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class WeatherFragment extends Fragment implements View.OnClickListener {

    private TextView cityTextView;
    private TextView nowTemperature;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WeatherActivity activity = (WeatherActivity) getActivity();
        updateWeatherData(new CityPreference(activity).getCity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_weather, container, false);

        cityTextView = rootView.findViewById(R.id.city_name);
        nowTemperature = rootView.findViewById(R.id.now_temperature);

        return rootView;
    }


    private void updateWeatherData(final String city) {
        try {
                cityTextView.setText("Погода в городе " + city);
                nowTemperature.setText("Сейчас на улице +50");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void changeCity(String city) {
        updateWeatherData(city);
    }

    @Override
    public void onClick(View v) {

    }
}
