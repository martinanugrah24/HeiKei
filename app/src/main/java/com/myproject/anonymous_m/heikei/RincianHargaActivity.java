package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RincianHargaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rincian_harga);
    }

    public void btnRincianHarga(View view)
    {
        Intent intent = new Intent(RincianHargaActivity.this, PesanActivity.class);
        startActivity(intent);
    }
}
