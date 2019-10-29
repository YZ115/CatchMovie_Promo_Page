package com.example.promo_page_take_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    ArrayList<String> itemsArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.ParentRV);
        layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new ParentRecyclerAdapter(itemsArrayList,MainActivity.this);
        recyclerView.setAdapter(adapter);
        setData();
    }
    private void setData(){
        String [] items = {"Current","Discounts","Movie Perks","Food and Beverages","Member's Exclusives","Partnerships"};
        for (int i=0;i<items.length;i++){
            itemsArrayList.add(items[i]);
        }
        adapter.notifyDataSetChanged();
    }
}
