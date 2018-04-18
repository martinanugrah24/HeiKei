package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PesanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
    }

    public void btnPesan(View view)
    {
        Intent intent = new Intent(PesanActivity.this, SuccessActivity.class);
        startActivity(intent);
    }
}
