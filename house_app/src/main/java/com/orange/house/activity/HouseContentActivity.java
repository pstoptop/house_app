package com.orange.house.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.orange.house.R;
import com.orange.house.adapter.House;

import java.util.ArrayList;


public class HouseContentActivity extends AppCompatActivity {

    private TextView tv_house_title;
    private TextView tv_house_content;
    private ArrayList<House> houses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_house_content);
        tv_house_title = (TextView) findViewById(R.id.tv_house_title);
        tv_house_content = (TextView) findViewById(R.id.tv_house_content);


    }
}
