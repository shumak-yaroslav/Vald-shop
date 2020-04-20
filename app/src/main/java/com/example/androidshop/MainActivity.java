package com.example.androidshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bnv;
    TextView text1, text2, text3, text4, text5, text6, text7, text8;
    TextView text9, text10, text11, text12, text13, text14, text15, text16;
    TextView text17, text18, text19, text20, text21, text22, text23, text24;
    ImageView img, img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16, img17;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference first = databaseReference.child("Icons");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=findViewById(R.id.imageView);
        img1=findViewById(R.id.imageView2);
        img2=findViewById(R.id.imageView3);
        img3=findViewById(R.id.imageView4);
        img4=findViewById(R.id.imageView5);
        img5=findViewById(R.id.imageView6);
        img6=findViewById(R.id.imageView7);
        img7=findViewById(R.id.imageView8);
        img8=findViewById(R.id.imageView9);
        img9=findViewById(R.id.imageView10);
        img10=findViewById(R.id.imageView17);
        img11=findViewById(R.id.imageView317);
        img12=findViewById(R.id.imageView457);
        img13=findViewById(R.id.imageView537);
        img14=findViewById(R.id.imageView11);
        img15=findViewById(R.id.imageView12);
        img16=findViewById(R.id.imageView13);
        img17=findViewById(R.id.imageView14);
        text24=findViewById(R.id.textView11);

        String url = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/vector.png?alt=media&token=846e75bf-18e1-47eb-af99-d8e341714aea";
        String url1 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/face.png?alt=media&token=eabae4b6-5229-4e4b-8843-6c27893232fd";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/vector1.png?alt=media&token=bf5588ad-f6a1-4113-8c37-f28416474752";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/vector2.png?alt=media&token=6aa4e77f-f046-45ca-afe8-281592b8b5b1";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/vector3.png?alt=media&token=0e72577f-f867-4dad-8835-2ff0b6bda63f";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/vector4.png?alt=media&token=7fdae5d3-0710-4c1a-a775-4a6dfe9f81af";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro1.png?alt=media&token=669a70f9-b029-4ccb-8375-51fa6d489707";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro2.png?alt=media&token=34e478a6-9184-4707-b812-8e3352cb6f75";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro3.png?alt=media&token=12d17e60-d1e2-486a-9e2a-1284fda0df26";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro4.png?alt=media&token=1a6794dd-27b4-4fb9-be1c-9dc4c512892c";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro5.png?alt=media&token=cebde400-fd40-45c6-a3b3-c0a82da9a7d7";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro6.png?alt=media&token=639c17cf-1309-4e81-af0c-1741af9c7be1";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro7.png?alt=media&token=9fe82baa-2388-43c2-9a68-e62e898e8b47";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/gro8.png?alt=media&token=85c3d44d-29ca-4663-91e2-a96d887ffef7";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/pear.png?alt=media&token=99bea44f-4d08-4964-881b-141fe0fb3714";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/pic.png?alt=media&token=1861e205-c8cb-46d1-b294-30099339ee3e";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/pic1.png?alt=media&token=3c9b2c1e-2a54-4c8f-8b81-33a51455bcd1";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/pic2.png?alt=media&token=c21282e2-7d97-456f-a4be-07b078dc8a8d";

        Glide.with(getApplicationContext()).load(url).into(img);
        Glide.with(getApplicationContext()).load(url1).into(img1);
        Glide.with(getApplicationContext()).load(url2).into(img2);
        Glide.with(getApplicationContext()).load(url3).into(img3);
        Glide.with(getApplicationContext()).load(url4).into(img4);
        Glide.with(getApplicationContext()).load(url5).into(img5);
        Glide.with(getApplicationContext()).load(url6).into(img6);
        Glide.with(getApplicationContext()).load(url7).into(img7);
        Glide.with(getApplicationContext()).load(url8).into(img8);
        Glide.with(getApplicationContext()).load(url9).into(img9);
        Glide.with(getApplicationContext()).load(url10).into(img10);
        Glide.with(getApplicationContext()).load(url11).into(img11);
        Glide.with(getApplicationContext()).load(url12).into(img12);
        Glide.with(getApplicationContext()).load(url13).into(img13);
        Glide.with(getApplicationContext()).load(url14).into(img14);
        Glide.with(getApplicationContext()).load(url15).into(img15);
        Glide.with(getApplicationContext()).load(url16).into(img16);
        Glide.with(getApplicationContext()).load(url17).into(img17);




        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
        bnv.setSelectedItemId(R.id.action_user);
        text1 = (TextView)findViewById(R.id.text1);
        text2 = (TextView)findViewById(R.id.text2);
        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);
        text5 = (TextView)findViewById(R.id.text5);
        text6 = (TextView)findViewById(R.id.text6);
        text7 = (TextView)findViewById(R.id.text7);
        text8 = (TextView)findViewById(R.id.text8);
        text9 = (TextView)findViewById(R.id.text12);
        text10 = (TextView)findViewById(R.id.text22);
        text11 = (TextView)findViewById(R.id.text32);
        text12 = (TextView)findViewById(R.id.text42);
        text13 = (TextView)findViewById(R.id.text52);
        text14 = (TextView)findViewById(R.id.textView);
        text15 = (TextView)findViewById(R.id.textView2);
        text16 = (TextView)findViewById(R.id.textView3);
        text17 = (TextView)findViewById(R.id.textView4);
        text18 = (TextView)findViewById(R.id.textView5);
        text19 = (TextView)findViewById(R.id.textView6);
        text20 = (TextView)findViewById(R.id.textView7);
        text21 = (TextView)findViewById(R.id.textView8);
        text22 = (TextView)findViewById(R.id.textView9);
        text23 = (TextView)findViewById(R.id.textView10);





    }


    @Override
    protected void onStart() {
        super.onStart();
        first.addValueEventListener (new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for ( DataSnapshot Subsnapshot : dataSnapshot.getChildren()) {
                    Icons icons = Subsnapshot.getValue(Icons.class);
                    String ShowData = icons.getName();
                    String ShowData1 = icons.getName1();
                    String ShowData2 = icons.getName2();
                    String ShowData3 = icons.getName3();
                    String ShowData4 = icons.getName4();
                    String ShowData5 = icons.getName5();
                    String ShowData6 = icons.getName6();
                    String ShowData7 = icons.getName7();
                    String ShowData8 = icons.getName8();
                    String ShowData9 = icons.getName9();
                    String ShowData10 = icons.getName10();
                    String ShowData11 = icons.getName11();
                    String ShowData12 = icons.getName12();
                    String ShowData13 = icons.getName13();
                    String ShowData14 = icons.getName14();
                    String ShowData15 = icons.getName15();
                    String ShowData16 = icons.getName16();
                    String ShowData17 = icons.getName17();
                    String ShowData18 = icons.getName18();
                    text9.setText(ShowData);
                    text10.setText(ShowData1);
                    text11.setText(ShowData2);
                    text12.setText(ShowData3);
                    text13.setText(ShowData4);
                    text1.setText(ShowData5);
                    text2.setText(ShowData6);
                    text3.setText(ShowData7);
                    text4.setText(ShowData8);
                    text5.setText(ShowData9);
                    text6.setText(ShowData10);
                    text7.setText(ShowData11);
                    text8.setText(ShowData12);
                    text16.setText(ShowData13);
                    text17.setText(ShowData14);
                    text18.setText(ShowData15);
                    text19.setText(ShowData16);
                    text14.setText(ShowData17);
                    text15.setText(ShowData18);

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
                        startActivity(new Intent(getApplicationContext(),Search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.action_user:
                        return true;
                }
                return true;
            }
        };


    }
}
