package com.example.androidshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

public class DrawerLayoutActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawerLayout;
    Toolbar toolbar;
    NavigationView  navigationView;
    ActionBarDrawerToggle toggle;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);


        // create drawer navigation view
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
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
//        switch (item.getItemId()){
//            case R.id.nav_home:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,
//                        new HomeFragment()).commit();
//                break;
//            case R.id.nav_dashboard:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,
//                        new DashboardFragment()).commit();
//                break;
//            case R.id.nav_orders:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,
//                        new OrdersFragment()).commit();
//                break;
//            case R.id.nav_notifications:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,
//                        new NotificationsFragment()).commit();
//                break;
//            case R.id.nav_activity:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view_tag,
//                        new ActivityFragment()).commit();
//                break;
//        }

//        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }
}
