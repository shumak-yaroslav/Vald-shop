package com.example.androidshop;

import android.content.Intent;
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

import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Basket extends AppCompatActivity {
    private BottomNavigationView bnv;
    ImageView img, img1, img2, img3, img4;
    TextView text1, text2, text3, text4, text5, text6, text7, text8;
    Button btn;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference first = databaseReference.child("Icons");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
        bnv.setSelectedItemId(R.id.action_coupons);
        btn = (Button)findViewById(R.id.button3);
        img=findViewById(R.id.imageView16);
        img1=findViewById(R.id.imageView19);
        img2=findViewById(R.id.imageView55);
        img3=findViewById(R.id.imageView61);
        img4=findViewById(R.id.imageView20);
        text1=findViewById(R.id.textView37);
        text2=findViewById(R.id.textView42);
        text3=findViewById(R.id.textView44);
        text4=findViewById(R.id.textView43);
        text5=findViewById(R.id.textView55);
        text6=findViewById(R.id.textView62);
        text7=findViewById(R.id.textView64);
        text8=findViewById(R.id.textView63);


        String url = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/leftarrow.png?alt=media&token=b2aa2c36-dd84-4661-a58d-283ed1f3528d";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/product1.png?alt=media&token=a0deb7a5-1d68-41d3-be31-8b08976eeaf7";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/rightarrow.png?alt=media&token=b8df9954-0b70-4dc3-9516-2e2fc4c7e85f";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/product2.png?alt=media&token=bf8172c9-9657-4230-bf4e-6f43d0610746";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/rightarrow.png?alt=media&token=b8df9954-0b70-4dc3-9516-2e2fc4c7e85f";

        Glide.with(getApplicationContext()).load(url).into(img);
        Glide.with(getApplicationContext()).load(url1).into(img1);
        Glide.with(getApplicationContext()).load(url2).into(img2);
        Glide.with(getApplicationContext()).load(url3).into(img3);
        Glide.with(getApplicationContext()).load(url4).into(img4);
        imageClick();
        btnClick();

    }

    public void imageClick () {
        img.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Basket.this, Search.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void btnClick () {
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Basket.this, payment.class);
                        startActivity(intent);
                    }
                }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
        first.addValueEventListener (new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for ( DataSnapshot Subsnapshot : dataSnapshot.getChildren()) {
                    Icons icons = Subsnapshot.getValue(Icons.class);
                    String ShowData1 = icons.getSeller1();
                    String ShowData2 = icons.getProduct1();
                    String ShowData3 = icons.getProduct11();
                    String ShowData4 = icons.getPrice1();
                    String ShowData5 = icons.getSeller2();
                    String ShowData6 = icons.getProduct2();
                    String ShowData7 = icons.getProduct21();
                    String ShowData8 = icons.getPrice2();
                    text1.setText(ShowData1);
                    text2.setText(ShowData2);
                    text3.setText(ShowData3);
                    text4.setText(ShowData4);
                    text5.setText(ShowData5);
                    text6.setText(ShowData6);
                    text7.setText(ShowData7);
                    text8.setText(ShowData8);

                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                /*Intent intent3 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent3);*/
            }
        });

    }
    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                        overridePendingTransition(0,0);
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
    }


