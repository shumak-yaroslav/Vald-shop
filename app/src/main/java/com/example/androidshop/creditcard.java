package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class creditcard extends AppCompatActivity {
        private BottomNavigationView bnv;
        Button btn;
        ImageView img, img1,img2,img3,img4,img5,img6;
        private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        private DatabaseReference databaseReference = firebaseDatabase.getReference();
        private DatabaseReference take = databaseReference.child("Icons");

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_creditcard);
            btn = (Button)findViewById(R.id.AddBtn);

            img = (ImageView)findViewById(R.id.back);
            img1 = (ImageView)findViewById(R.id.lock);
            img2 = (ImageView)findViewById(R.id.basket);
            img3 = (ImageView)findViewById(R.id.visa);
            img4 = (ImageView)findViewById(R.id.mastercard);
            img5 = (ImageView)findViewById(R.id.ali);
            img6 = (ImageView)findViewById(R.id.discover);

            btn.setAllCaps(false);
            bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView4);
            bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
            bnv.setSelectedItemId(R.id.action_user);

            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fnext%201.png?alt=media&token=aa148684-f093-4241-a5ba-ca67249a653b",img);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Flock%202.png?alt=media&token=54ae057d-edeb-4e48-9c51-385c2c632ec5",img1);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Forderby.png?alt=media&token=9e0dc7bb-fe7b-47bb-b552-1d63214cf82d",img2);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2024.png?alt=media&token=8549d121-07cb-4a20-b4c2-9ea767c8e287",img3);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2026.png?alt=media&token=ff0a6bd4-2299-4ebc-8cc9-741199399752",img4);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2025.png?alt=media&token=31d55d1d-3742-44d9-b24e-44bbd2d270d1",img5);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2029.png?alt=media&token=dbdf94af-fa6f-4c4c-afea-d688ec43693e",img6);

            backStep();
        }
        private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
            return new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.action_home:
                            Intent intent = new Intent(creditcard.this, Main2Activity.class);
                            startActivity(intent);
                            break;
                    }
                    return true;
                }
            };


        }

        public void loadImg(String url, ImageView img){
            Glide.with(getApplicationContext()).load(url).into(img);
        }

        private void backStep(){
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(creditcard.this,payment.class);
                    startActivity(intent);
                }
            });
        }
    }


