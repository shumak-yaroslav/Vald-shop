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
import android.widget.LinearLayout;

public class payment extends AppCompatActivity {
        private BottomNavigationView bnv;
        private Button btn;
        LinearLayout addCreditCard;

        ImageView img, img1,img2,img3;

        private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        private DatabaseReference databaseReference = firebaseDatabase.getReference();
        private DatabaseReference take = databaseReference.child("Icons");
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_payment);

            img = (ImageView)findViewById(R.id.back);
            img1 = (ImageView)findViewById(R.id.next);
            img2 = (ImageView)findViewById(R.id.card);
            img3 = (ImageView)findViewById(R.id.paypal);
            btn = (Button)findViewById(R.id.button3);

            addCreditCard = (LinearLayout)findViewById(R.id.addCreditCard);
            bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView5);
            bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
            bnv.setSelectedItemId(R.id.action_user);
            addCard();


            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fnext%201.png?alt=media&token=aa148684-f093-4241-a5ba-ca67249a653b",img);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fnext%202.png?alt=media&token=f8750004-a8eb-497d-bc71-47eaee5b6840",img1);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2026.png?alt=media&token=ff0a6bd4-2299-4ebc-8cc9-741199399752",img2);
            loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fimage%2027.png?alt=media&token=b1379a57-229e-4adc-bf01-b0b2c5a38590",img3);
            imageClick();

        }


    public void imageClick () {
        img.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(payment.this, Basket.class);
                        startActivity(intent);
                    }
                }
        );
    }





        private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
            return new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.action_home:
                            Intent intent = new Intent(payment.this, Main2Activity.class);
                            startActivity(intent);
                            break;
                    }
                    return true;
                }
            };



        }

        private void addCard(){
            addCreditCard.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(payment.this, creditcard.class);
                    startActivity(intent);
                }
            });
        }

        public void loadImg(String url, ImageView img){
            Glide.with(getApplicationContext()).load(url).into(img);
        }
    }


