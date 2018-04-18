package com.myproject.anonymous_m.heikei;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;

import at.markushi.ui.CircleButton;

public class PaketBerlanggananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_berlangganan);

        Typeface tf = Typeface.createFromAsset(getAssets(),  "berlinsans.TTF");

        CircleButton circleButton1 = findViewById(R.id.cb1);
        TextDrawable text1= new TextDrawable(this);
        text1.setText("7500k");
        text1.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text1.setTextSize(25);
        text1.setTypeface(tf);
        circleButton1.setImageDrawable(text1);

        CircleButton circleButton2 = findViewById(R.id.cb2);
        TextDrawable text2= new TextDrawable(this);
        text2.setText("6500k");
        text2.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text2.setTextSize(25);
        text2.setTypeface(tf);
        circleButton2.setImageDrawable(text2);

        CircleButton circleButton3 = findViewById(R.id.cb3);
        TextDrawable text3= new TextDrawable(this);
        text3.setText("6000k");
        text3.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text3.setTextSize(25);
        text3.setTypeface(tf);
        circleButton3.setImageDrawable(text3);

        CircleButton circleButton4 = findViewById(R.id.cb4);
        TextDrawable text4= new TextDrawable(this);
        text4.setText("3500k");
        text4.setTextAlign(Layout.Alignment.ALIGN_CENTER);
        text4.setTextSize(25);
        text4.setTypeface(tf);
        circleButton4.setImageDrawable(text4);
    }

    public void btnPaketBerlangganan(View view)
    {
        Intent intent = new Intent(PaketBerlanggananActivity.this, RincianHargaActivity.class);
        startActivity(intent);
    }
}
