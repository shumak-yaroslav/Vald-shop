package com.example.androidshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class AnalisLayot extends AppCompatActivity {
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference take = databaseReference.child("Icons");

    ImageView img;

    GraphView graph,costs,quater,acquisition,monthly_profit;
    LineGraphSeries<DataPoint> series;
    BarGraphSeries<DataPoint> series1;

    private Bitmap bmp;
    private Canvas canvas;
    private Paint paint;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analis_layot);

        img = (ImageView)findViewById(R.id.back);

        imgClick();
        loadImg( "https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/%D0%BE%D0%B1%D1%89%D0%B8%D0%B5%2Fdown-arrow%202.png?alt=media&token=16300311-8b6b-46d3-a059-059aeca1864c",img);

        //create liner graphic
        graph = findViewById(R.id.graph);
        costs = findViewById(R.id.costs);
        quater = findViewById(R.id.quater);
        acquisition = findViewById(R.id.acquisition);
        monthly_profit = findViewById(R.id.monthly_profit);


        series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        series1 = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(0, -2),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        graph.addSeries(series);
        costs.addSeries(series);
        acquisition.addSeries(series1);
        monthly_profit.addSeries(series);
        quater.addSeries(series1);




    }



    public void loadImg(String url, ImageView img){
        Glide.with(getApplicationContext()).load(url).into(img);
    }

    public void imgClick(){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnalisLayot.this,DrawerLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
