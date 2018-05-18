package com.example.anupo.anupomroy_comp304_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May18, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     Lab Assignment 1
 * */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initializing getintent
        Intent intent=getIntent();

        //declaring string

        String displayName =intent.getStringExtra("name");
        String displayHobby =intent.getStringExtra("hobby");

        //seting the content of textview

        TextView textView=(TextView)findViewById(R.id.displayTv);
        textView.setText("\n Name: "+displayName+"\n Hobby: "+displayHobby);
    }
}
