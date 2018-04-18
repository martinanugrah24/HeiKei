package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.raion.android.heikei.SplashScreenActivity;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent i = new Intent(this, SplashScreenActivity.class);
        startActivity(i);
    }
}
