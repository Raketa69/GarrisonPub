package com.example.garrisonbarv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class signActivity extends AppCompatActivity {

    Button btnSignIn, btnRegister;
    //FirebaseAuth

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        getSupportActionBar().hide();

        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        Button btnRegister = (Button) findViewById(R.id.btnRegistr);

    }
}