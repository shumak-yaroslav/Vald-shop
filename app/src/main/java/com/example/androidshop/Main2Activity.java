package com.example.androidshop;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.arch.core.util.Function;

import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.IOException;
import java.sql.SQLException;

public class Main2Activity extends AppCompatActivity {
    private BottomNavigationView bnv;


    private SQLiteDatabase mDb;

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12,img13,img14,img15,img16;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference take = databaseReference.child("Icons");

    //    private  String[] citys = {"Los Angeles","New-York"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
        textView1 = (TextView)findViewById(R.id.text_sup);
        textView2 = (TextView)findViewById(R.id.text_baby);
        textView3 = (TextView)findViewById(R.id.text_digital);
        textView4 = (TextView)findViewById(R.id.text_food);
        textView5 = (TextView)findViewById(R.id.text_life);
        textView6 = (TextView)findViewById(R.id.text_global);
        textView7 = (TextView)findViewById(R.id.text_member);
        textView8 = (TextView)findViewById(R.id.text_coupon);
        textView9 = (TextView)findViewById(R.id.text_spike);
        textView10 = (TextView)findViewById(R.id.text_integral);

        img1 = (ImageView)findViewById(R.id.supermarket);
        img2 = (ImageView)findViewById(R.id.baby);
        img3 = (ImageView)findViewById(R.id.digital);
        img4 = (ImageView)findViewById(R.id.food);
        img5 = (ImageView)findViewById(R.id.life);
        img6 = (ImageView)findViewById(R.id.global);
        img7 = (ImageView)findViewById(R.id.member);
        img8 = (ImageView)findViewById(R.id.coupon);
        img9 = (ImageView)findViewById(R.id.spike);
        img10 = (ImageView)findViewById(R.id.integral);
        img11 = (ImageView)findViewById(R.id.imageView6);
        img12 = (ImageView)findViewById(R.id.imageView);
        img13 = (ImageView)findViewById(R.id.lipstick);
        img14 = (ImageView)findViewById(R.id.lotion);
        img15 = (ImageView)findViewById(R.id.imageView3);
        img16 = (ImageView)findViewById(R.id.imageView4);

        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/shop.png?alt=media&token=07466dfd-c211-49a0-a5b0-ee7f1f5fe670",img1);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/child.png?alt=media&token=1139a19d-7392-435e-9e66-7c336f9d5e2c",img2);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/photo.png?alt=media&token=b6a6d4b7-308f-456a-9559-efe537ea0e3b",img3);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/food.png?alt=media&token=35192919-93a5-4d23-9410-4b02e9dc4e62",img4);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/star.png?alt=media&token=f24ae179-1da5-4035-83e2-a39d9ca6f501",img5);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/global.png?alt=media&token=c148ece1-3d7e-44ba-8160-598c5a065730",img6);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/crown.png?alt=media&token=b7f03f4f-e2fb-40c3-97da-e00f2498b176",img7);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/coupon.png?alt=media&token=e50189a6-2576-435e-919e-51d1b70779f1",img8);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/thunder.png?alt=media&token=52009bfa-d532-4bae-b23f-4d1031fd3af3",img9);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/starincircle.png?alt=media&token=0f7ed4a5-586a-43d5-a936-a122ba36de75",img10);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/imagecomp.png?alt=media&token=c976d64e-4438-4fa0-8daa-9507a9d60850",img11);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/imageproducts.png?alt=media&token=96c4d030-9358-4306-87cf-6d0f41533e45",img12);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/image.png?alt=media&token=2b0fd2df-0011-45fc-a448-d45385ec7a51",img13);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/clenerplac.png?alt=media&token=99382df8-e171-41a7-a5ba-4b7f0df47fa7",img14);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/orderby.png?alt=media&token=4c8d506e-1f82-4feb-8080-5aa91be71df1",img15);
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/user.png?alt=media&token=8e3a1649-3c97-4e23-b21b-83d56c37442e",img16);
        imageClick();
        imageClick2();





//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,citys);
//        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//
//        Spinner spinner = (Spinner)findViewById(R.id.spCity);
//
//        spinner.setAdapter(arrayAdapter);

    }

    public void imageClick () {
        img15.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Main2Activity.this, Basket.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick2 () {
        img16.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
    @Override
    public void onStart(){
        super.onStart();
        take.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot key : dataSnapshot.getChildren()){
                    Icons icons= key.getValue(Icons.class);
                    String showData = icons.getSupermarket();
                    String showData1 = icons.getBaby();
                    String showData2 = icons.getDigital();
                    String showData3 = icons.getFood();
                    String showData4 = icons.getLife();
                    String showData5 = icons.getGlobal();
                    String showData6 = icons.getMember();
                    String showData7 = icons.getCoupon();
                    String showData8 = icons.getSpike();
                    String showData9 = icons.getIntegral();

                    textView1.setText(showData);
                    textView2.setText(showData1);
                    textView3.setText(showData2);
                    textView4.setText(showData3);
                    textView5.setText(showData4);
                    textView6.setText(showData5);
                    textView7.setText(showData6);
                    textView8.setText(showData7);
                    textView9.setText(showData8);
                    textView10.setText(showData9);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }



    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        return true;
                    case R.id.action_search:
                        startActivity(new Intent(getApplicationContext(),Discounts.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_notification:
                        startActivity(new Intent(getApplicationContext(),Notification.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_coupons:
                        startActivity(new Intent(getApplicationContext(),Search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_user:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return true;
            }
        };


    }

    public void loadImg(String url, ImageView img){
        Glide.with(getApplicationContext()).load(url).into(img);
    }


}
