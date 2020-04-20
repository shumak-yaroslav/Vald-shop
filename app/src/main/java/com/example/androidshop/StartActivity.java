package com.example.androidshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity {

    Button log,sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        log = findViewById(R.id.log_in);
        sign = findViewById(R.id.sign_up);
        log.setAllCaps(false);
        sign.setAllCaps(false);



        sign_up();
        log_in();
    }

    public void sign_up(){
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,Registr.class);
                startActivity(intent);
            }
        });
    }
    public void log_in(){
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this,EnterToAdmin.class);
                startActivity(intent);
            }
        });
    }

}
