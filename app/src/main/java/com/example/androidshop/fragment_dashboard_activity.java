package com.example.androidshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class fragment_dashboard_activity extends Fragment {

    LinearLayout analytics,customres,orders,tasks,sales,products;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        analytics = getActivity().findViewById(R.id.analytics);
        customres = getActivity().findViewById(R.id.customres);
        orders = getActivity().findViewById(R.id.orders);
        tasks = getActivity().findViewById(R.id.tasks);
        sales = getActivity().findViewById(R.id.sales);
        products = getActivity().findViewById(R.id.products);
        linerClick(analytics);
        linerClick1(customres);
        linerClick2(orders);
        linerClick3(tasks);
        linerClick4(sales);
        linerClick5(products);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard_activity, container, false);
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
    public void linerClick1(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Customers.class);
                startActivity(intent);
            }
        });

    }
    public void linerClick2(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Orders.class);
                startActivity(intent);
            }
        });

    }
    public void linerClick3(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Tasks.class);
                startActivity(intent);
            }
        });

    }
    public void linerClick4(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Sales.class);
                startActivity(intent);
            }
        });

    }
    public void linerClick5(LinearLayout img){
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),Products.class);
                startActivity(intent);
            }
        });

    }
}
