package com.example.anupo.anupomroy_comp304_task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*
 * Author:  Anupom Roy
 * Subject: Mobile Application Development
 * date:    May18, 2018
 * Professor:Vinayagathas Vaithilingam
 * Lab:     LabAssignment 1
 * */
public class FirstActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
    EditText msgName,msgHobby;
    public void Send_Message(View view)
    {
        msgName=(EditText)findViewById(R.id.txtName);
        String strName = msgName.getText().toString();

        msgHobby=(EditText)findViewById(R.id.txtHobby);
        String strHobby=msgHobby.getText().toString();
        if (view.getId()==R.id.sendBtn)
        {
            Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("name",strName);
            intent.putExtra("hobby",strHobby);
            startActivity(intent);
        }
    }
}
