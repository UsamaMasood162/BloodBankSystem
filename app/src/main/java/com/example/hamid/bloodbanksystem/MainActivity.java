package com.example.hamid.bloodbanksystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Loginbtn;
    EditText name,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        setListner();
    }

    private void setListner() {
        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().equals("Hamid")&&password.getText().toString().equals("12345"))
                {
                    Intent intent=new Intent(MainActivity.this,homPage.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Login Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void initview() {
        Loginbtn=findViewById(R.id.Loginbtn);
        name=findViewById(R.id.name);
        password=findViewById(R.id.password);
    }


}
