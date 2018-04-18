package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.raion.android.heikei.MainActivity;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }

    public void btnSuccess(View view)
    {
        Intent intent = new Intent(SuccessActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
