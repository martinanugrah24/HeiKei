package com.raion.android.heikei;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CategoryActivity extends AppCompatActivity {
    public static String category;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


//        bt_vege.setOnClickListener(this);

    }


    public void buttonVeg(View view)
    {
        try {
            Intent myIntent = new Intent(this,Class.forName("com.myproject.anonymous_m.heikei.TempatKateringActivity"));
            startActivity(myIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
