package com.example.garrisonbarv2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.garrisonbarv2.models.AccessController;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {

    private SharedPreferences mSettings;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_STATUS = "status";
    private int status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        getSupportActionBar().hide();

        Intent intentStart = new Intent(this, StartDownloadActivity.class);
        Intent intentSign = new Intent(this, signActivity.class);

        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        // Запоминаем данные
        //SharedPreferences.Editor editor = mSettings.edit();
        //editor.putInt(APP_PREFERENCES_STATUS, status);
        //editor.apply();

        if (mSettings.contains(APP_PREFERENCES_STATUS)) {
            // Получаем число из настроек
            status = mSettings.getInt(APP_PREFERENCES_STATUS, 0);
            // Выводим на экран данные из настроек
            Log.e("STATUS", "STATUS IS " + status);
        }

            if(status == 0)
            {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        startActivity(intentSign);
                    }
                }, 1000);
            }
            else
            {
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        startActivity(intentStart);
                    }
                }, 1000);
            }





    }
}