package com.example.hamid.bloodbanksystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homPage extends AppCompatActivity {
    Button needBloodbtn,donarbtn,infoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hom_page);
        initview();
        setListner();
    }
    private void setListner() {
        donarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homPage.this,DonarInfo.class);
                startActivity(intent);

            }
        });
        needBloodbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homPage.this,needBlood.class);
                startActivity(intent);
            }
        });
        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homPage.this,information.class);
                startActivity(intent);
            }
        });

    }

    private void initview() {
        donarbtn=findViewById(R.id.donarbtn);
        needBloodbtn=findViewById(R.id.needBloodbtn);
        infoBtn=findViewById(R.id.infoBtn);
    }

}
