package com.example.androidshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Feed extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView  navigationView;
    ActionBarDrawerToggle toggle;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed);


        // create drawer navigation view
        drawerLayout = (DrawerLayout) findViewById(R.id.feed);
        toolbar = findViewById(R.id.toolbar);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        toggle =  new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.drawerOpen,R.string.drawerClose);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();



    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent1 = new Intent(Feed.this, DrawerLayoutActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_dashboard:
                Intent intent2 = new Intent(Feed.this,DashboardLayoutActivity.class);
                startActivity(intent2);

                break;
            case R.id.nav_orders:
                Intent intent3 = new Intent(Feed.this,Orders.class);
                startActivity(intent3);
                break;
            case R.id.nav_notifications:
                Intent intent4 = new Intent(Feed.this,NotificationLayoutActivity.class);
                startActivity(intent4);
                break;
            case R.id.nav_activity:

                break;
            case R.id.nav_logout:
                Intent intent5 = new Intent(Feed.this, EnterToAdmin.class);
                startActivity(intent5);

        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
