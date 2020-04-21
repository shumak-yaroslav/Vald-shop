package com.example.androidshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Registr extends AppCompatActivity {
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference take = databaseReference.child("Icons");

    ImageView img;
    Button sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        img = (ImageView)findViewById(R.id.back);
        sign = findViewById(R.id.sign_up);
        sign.setAllCaps(false);



        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/%D0%BE%D0%B1%D1%89%D0%B8%D0%B5%2Fdown-arrow%202.png?alt=media&token=16300311-8b6b-46d3-a059-059aeca1864c",img);
        log_in();
        imgClick();
    }
    public void loadImg(String url, ImageView img){
        Glide.with(getApplicationContext()).load(url).into(img);
    }
    public void log_in(){
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registr.this,EnterToAdmin.class);
                startActivity(intent);
            }
        });
    }

    public void imgClick(){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Registr.this,StartActivity.class);
                startActivity(intent);
            }
        });
    }
}
