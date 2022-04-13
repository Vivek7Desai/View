package com.example.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv_pennolist;
LinearLayoutManager llm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_pennolist =findViewById(R.id.pennolist);

        llm = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL,false);
        rv_pennolist.setLayoutManager(llm);
    }
}