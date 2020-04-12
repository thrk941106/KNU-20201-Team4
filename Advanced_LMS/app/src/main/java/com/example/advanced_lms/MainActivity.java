package com.example.advanced_lms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebLogic w = new WebLogic("id", "pw"); // id , password
        w.attemptLogin();
    }
}
