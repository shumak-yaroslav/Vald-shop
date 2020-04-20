package com.example.androidshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EnterToAdmin extends AppCompatActivity {
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference take = databaseReference.child("Icons");

    private static final String email_admin = "admin";
    private static final String pass_admin = "admin";



    ImageView img;
    Button log;
    EditText mail,psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_admin);
        img = (ImageView)findViewById(R.id.back);
        mail = findViewById(R.id.mail);
        psw = findViewById(R.id.psw);
        log = findViewById(R.id.log_in);
        log.setAllCaps(false);



        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshopvlad.appspot.com/o/add%20card%2Fnext%201.png?alt=media&token=aa148684-f093-4241-a5ba-ca67249a653b",img);



        imgClick();
        logClick();
    }

    public void loadImg(String url, ImageView img){
        Glide.with(getApplicationContext()).load(url).into(img);
    }
    public void imgClick(){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterToAdmin.this,StartActivity.class);
                startActivity(intent);
            }
        });
    }

    public void logClick(){
        log.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(email_admin.equals(String.valueOf(mail.getText())) && pass_admin.equals(String.valueOf(psw.getText()))){
                            Intent intent = new Intent(EnterToAdmin.this,DrawerLayoutActivity.class);
                            startActivity(intent);
                        }
//                        if(email_admin.equals(String.valueOf(mail.getText())) && pass_admin.equals(String.valueOf(psw.getText()))){
//                            Intent intent = new Intent(EnterToAdmin.this,DrawerLayoutActivity.class);
//                            startActivity(intent);
//                        }
                        else{
                            Toast.makeText(
                                    EnterToAdmin.this,"Wrong",
                                    Toast.LENGTH_SHORT
                            ).show();
                        }
                    }
                }
        );
    }
}
