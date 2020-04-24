package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;

import com.bumptech.glide.Glide;
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

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sales extends AppCompatActivity {
    LinearLayout linear1, linear2, linear3, linear4, linear5, linear6, linear7, linear8, linear9, linear10, linear11;
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13;
    TextView text1, text2, text3;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference first = databaseReference.child("AdminLayouts");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        linear1=(LinearLayout)findViewById(R.id.linear1);
        linear2=(LinearLayout)findViewById(R.id.linear2);
        linear3=(LinearLayout)findViewById(R.id.linear3);
        linear4=(LinearLayout)findViewById(R.id.linear4);
        linear5=(LinearLayout)findViewById(R.id.linear5);
        linear6=(LinearLayout)findViewById(R.id.linear6);
        linear7=(LinearLayout)findViewById(R.id.linear7);
        linear8=(LinearLayout)findViewById(R.id.linear8);
        linear9=(LinearLayout)findViewById(R.id.linear9);
        linear10=(LinearLayout)findViewById(R.id.linear10);
        linear11=(LinearLayout)findViewById(R.id.linear11);

        img1=(ImageView)findViewById(R.id.imageView102);
        img2=(ImageView)findViewById(R.id.imageView101);
        img3=(ImageView)findViewById(R.id.imageView012);
        img4=(ImageView)findViewById(R.id.imageView011);
        img5=(ImageView)findViewById(R.id.imageView120);
        img6=(ImageView)findViewById(R.id.imageView110);
        img7=(ImageView)findViewById(R.id.imageView0012);
        img8=(ImageView)findViewById(R.id.imageView0011);
        img9=(ImageView)findViewById(R.id.imageView12);
        img10=(ImageView)findViewById(R.id.imageView11);
        img11=(ImageView)findViewById(R.id.imageView1100);
        img12=(ImageView)findViewById(R.id.imageView016);
        img13=(ImageView)findViewById(R.id.imageView16);

        String url = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/admin_img%2Fadmin1.png?alt=media&token=bb71ac10-21a6-48e6-bd56-7c4e58c56b39";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/admin_img%2FVector.png?alt=media&token=5a33a36d-1ab2-4861-9760-e943b322b412";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/admin_img%2Fplus%203.png?alt=media&token=27936fb8-52ff-4e05-987e-885fcf2a663f";

        Glide.with(getApplicationContext()).load(url).into(img1);
        Glide.with(getApplicationContext()).load(url).into(img2);
        Glide.with(getApplicationContext()).load(url).into(img3);
        Glide.with(getApplicationContext()).load(url).into(img4);
        Glide.with(getApplicationContext()).load(url).into(img5);
        Glide.with(getApplicationContext()).load(url).into(img6);
        Glide.with(getApplicationContext()).load(url).into(img7);
        Glide.with(getApplicationContext()).load(url).into(img8);
        Glide.with(getApplicationContext()).load(url).into(img9);
        Glide.with(getApplicationContext()).load(url).into(img10);
        Glide.with(getApplicationContext()).load(url).into(img11);
        Glide.with(getApplicationContext()).load(url1).into(img12);
        Glide.with(getApplicationContext()).load(url2).into(img13);

        text1=(TextView)findViewById(R.id.textView202);
        text2=(TextView)findViewById(R.id.textView203);
        text3=(TextView)findViewById(R.id.textView501);

        imageClick1();
        imageClick2();
        imageClick3();
        imageClick4();
        imageClick5();
        imageClick6();
        imageClick7();
        imageClick8();
        imageClick9();
        imageClick10();
        imageClick11();
        imageClick12();
    }

    public void imageClick1 () {
        linear1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales1.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick2 () {
        linear2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales2.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick3 () {
        linear3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales3.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick4 () {
        linear4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales4.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick5 () {
        linear5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales5.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick6 () {
        linear6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales6.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick7 () {
        linear7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales7.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick8 () {
        linear8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales8.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick9 () {
        linear9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales9.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick10 () {
        linear10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales10.class);
                        startActivity(intent);
                    }
                }
        );
    }

    public void imageClick11 () {
        linear11.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, Sales11.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void imageClick12 () {
        img12.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Sales.this, DrawerLayoutActivity.class);
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
                    AdminLayouts adminLayouts = Subsnapshot.getValue(AdminLayouts.class);
                    String ShowData = adminLayouts.getSale1();
                    String ShowData1 = adminLayouts.getSale1Info();
                    String ShowData2 = adminLayouts.getSale1Status();
                    text1.setText(ShowData);
                    text2.setText(ShowData1);
                    text3.setText(ShowData2);


                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                /*Intent intent3 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent3);*/
            }
        });

    }

}
