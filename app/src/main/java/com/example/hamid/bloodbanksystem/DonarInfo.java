package com.example.hamid.bloodbanksystem;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class DonarInfo extends AppCompatActivity {
    Button cont;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donar_info);
        initview();
        setListner();
        addItemtosppiner();
    }

    private void addItemtosppiner() {
        List<String>list=new ArrayList<>();
        list.add("A+");
        list.add("A-");
        list.add("B+");
        list.add("B-");
        list.add("O+");
        list.add("O-");
        list.add("AB+");
        list.add("AB-");
        ArrayAdapter<String> dataAdapter=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,list);
        spinner.setAdapter(dataAdapter);
    }


    private void setListner() {
    cont.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent("Android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.google.com/maps/@33.5536128,73.1086848,13z"));
            startActivity(intent);
        }
    });
    }

    private void initview() {
        cont=findViewById(R.id.cont);
        spinner=findViewById(R.id.spinner);
    }

}
