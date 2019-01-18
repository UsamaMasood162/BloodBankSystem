package com.example.hamid.bloodbanksystem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class needBlood extends AppCompatActivity {

    private Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button confirm;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_need_blood);
        intiview();
        setListner();

    }

    private void intiview() {

        confirm=findViewById(R.id.conform);
    }

    private void setListner() {
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("Android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.google.com/maps/@33.5536128,73.1086848,13z"));
                startActivity(intent);
            }
        });
    }
}
