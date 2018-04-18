package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

import at.markushi.ui.CircleButton;

public class HariBerlanggananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hari_berlangganan);

        Typeface tf = Typeface.createFromAsset(getAssets(),  "berlinsans.TTF");

        CircleButton circleButton1 = findViewById(R.id.cb1);
        TextDrawable text1= new TextDrawable(this);
        text1.setText("30 hari");
        text1.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text1.setTextSize(25);
        text1.setTypeface(tf);
        circleButton1.setImageDrawable(text1);

        CircleButton circleButton2 = findViewById(R.id.cb2);
        TextDrawable text2= new TextDrawable(this);
        text2.setText("15 hari");
        text2.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text2.setTextSize(25);
        text2.setTypeface(tf);
        circleButton2.setImageDrawable(text2);
    }

    public void btnHariBerlangganan(View view)
    {
        Intent intent = new Intent(HariBerlanggananActivity.this, PaketBerlanggananActivity.class);
        startActivity(intent);
    }
}
