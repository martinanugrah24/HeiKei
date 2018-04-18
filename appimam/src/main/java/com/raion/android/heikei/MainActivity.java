package com.raion.android.heikei;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button main = (Button) findViewById(R.id.bt_main);
        Button profile = (Button) findViewById(R.id.bt_profile);
        Button settings = (Button) findViewById(R.id.bt_settings);

        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent catIn = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(catIn);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
