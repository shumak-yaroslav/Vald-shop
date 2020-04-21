package com.example.androidshop;




import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class HomeActivity extends Fragment {

    LinearLayout analytics;

    ImageView img;

    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference databaseReference = firebaseDatabase.getReference();
    private DatabaseReference take = databaseReference.child("Icons");

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        analytics = getActivity().findViewById(R.id.analytics);
        img = getActivity().findViewById(R.id.img_analitycs);
        linerClick(analytics);

        //create liner graphic
        GraphView graph = getActivity().findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        graph.addSeries(series);


//        loadImg("https://firebasestorage.googleapis.com/v0/b/androidshop-6672b.appspot.com/o/home_fragment%2FGroup%2020.png?alt=media&token=a30b9da3-0456-4e4d-bab0-d061a3787fa2",img);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home_activity, container, false);


    }

    public void linerClick(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AnalisLayot.class);
                startActivity(intent);
            }
        });

    }

//    public void loadImg(String url, ImageView img){
//        Glide.with(getActivity().getApplicationContext()).load(url).into(img);
//    }



}
