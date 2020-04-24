package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EnterToAdmin extends AppCompatActivity {

    TextView textViewsignup;

    private static final String email_admin = "admin";
    private static final String pass_admin = "admin";
    private static final String email_user1 = "user1";
    private static final String pass_user1 = "user1";




    Button log;
    EditText mail,psw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_to_admin);
        mail = findViewById(R.id.Email);
        psw = findViewById(R.id.psw);
        log = findViewById(R.id.log_in);

        textViewsignup = (TextView)findViewById(R.id.textviewsignup);
        textViewsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EnterToAdmin.this,Registr.class);
                startActivity(intent);
            }
        });





        logClick();
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
                            Intent intent = new Intent(EnterToAdmin.this, Main2Activity.class);
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
