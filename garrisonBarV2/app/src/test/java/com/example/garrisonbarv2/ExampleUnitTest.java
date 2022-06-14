package com.example.garrisonbarv2;

import org.junit.Test;

import static org.junit.Assert.*;

import android.content.SharedPreferences;
import android.util.Log;
import android.content.SharedPreferences;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    private SharedPreferences mSettings;
    public static final String APP_PREFERENCES = "mysettings";
    public static final String APP_PREFERENCES_STATUS = "status";
    private int status;

    
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void mSettings_isCorrect() {

        if (mSettings.contains(APP_PREFERENCES_STATUS)) {
            Log.e("mSettings", "mSettings is correct" + status);
        }
        else
        {
            Log.e("mSettings", "mSettings is NOT correct" + status);
        }
    }





}