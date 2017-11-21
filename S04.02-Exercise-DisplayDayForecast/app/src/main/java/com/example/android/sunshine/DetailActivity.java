package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    private TextView mWeatherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent passedIntent = getIntent();
        if (passedIntent.hasExtra(Intent.EXTRA_TEXT)) {
            mWeatherText = (TextView) findViewById(R.id.tv_weather_details);
            mWeatherText.setText(passedIntent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}