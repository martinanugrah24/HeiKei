package com.raion.android.heikei;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {
//    View decorView = getWindow().getDecorView();
//    // Hide the status bar.
//    int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
//    decorView.setSystemUiVisibility(uiOptions);
//    // Remember that you should never show the action bar if the
//    // status bar is hidden, so hide that too if necessary.
//    ActionBar actionBar = getActionBar();
//    actionBar.hide();

    public static int timeOut = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent loginIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                finish();
            }
        }, timeOut);
    }
}
