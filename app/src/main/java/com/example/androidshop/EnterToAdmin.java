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
    private static final String email_user1 = "user1";
    private static final String pass_user1 = "user1";




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



        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/%D0%BE%D0%B1%D1%89%D0%B8%D0%B5%2Fdown-arrow%202.png?alt=media&token=16300311-8b6b-46d3-a059-059aeca1864c",img);



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
                        else if(email_user1.equals(String.valueOf(mail.getText())) && pass_user1.equals(String.valueOf(psw.getText()))){
                            Intent intent = new Intent(EnterToAdmin.this,Main2Activity.class);
                            startActivity(intent);
                        }
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
