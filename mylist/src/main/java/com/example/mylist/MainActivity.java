package com.example.mylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);

//        List<Bean> list = new ArrayList<Bean>();
//        list.add(new Bean("1","11"));
//        list.add(new Bean("1","22"));
//        list.add(new Bean("1","33"));
//        list.add(new Bean("1","11"));
//        list.add(new Bean("1","22"));
//        list.add(new Bean("1","33"));
//        list.add(new Bean("1","11"));
//        list.add(new Bean("1","22"));
//        list.add(new Bean("1","33"));
//        list.add(new Bean("1","11"));
//        list.add(new Bean("1","22"));
//        list.add(new Bean("1","33"));
//        list.add(new Bean("1","11"));
//        list.add(new Bean("1","22"));
//        list.add(new Bean("1","33"));

        MyAdater adapter = new MyAdater(list,getApplicationContext());
        lv.setAdapter(adapter);

    }
}
