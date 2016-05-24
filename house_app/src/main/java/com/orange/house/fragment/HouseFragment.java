package com.orange.house.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.orange.house.R;
import com.orange.house.activity.HouseContentActivity;
import com.orange.house.adapter.House;
import com.orange.house.adapter.MyAdapter;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/5/3.
 */
public class HouseFragment extends Fragment implements AdapterView.OnItemClickListener {

    private FragmentManager ftManager;
    private ArrayList<House> houses;
    private ListView house_listview;
    private FrameLayout fl_content;
    private TextView tv_title;
    private MyAdapter myAdapter;

    public HouseFragment() {

    }

    public HouseFragment(FragmentManager ftManager, ArrayList<House> houses) {
        this.ftManager = ftManager;
        this.houses = houses;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        houses = new ArrayList<House>();
        for (int i = 0; i <= 20; i++) {
            House data = new House("武林一号" + i, i + "~杭州武林路一号~~~~~~~~");
            houses.add(data);
        }
        myAdapter = new MyAdapter(houses, getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = View.inflate(getActivity(), R.layout.house_fragment, null);
//        TextView tv_house_content = (TextView) view.findViewById(R.id.tv_house_content);
//        tv_house_content.setText("第二个Fragment");
//        return view;



        View view = inflater.inflate(R.layout.house_fragment, container, false);
        house_listview = (ListView) view.findViewById(R.id.house_listview);
        tv_title = (TextView) view.findViewById(R.id.tv_title);

        house_listview.setAdapter(myAdapter);
        house_listview.setOnItemClickListener(this);
        return view;
    }



    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

         Intent intent = new Intent(getContext(), HouseContentActivity.class);
        startActivity(intent);

     //   Toast.makeText(getContext(),"你点击了第" + position + "项",Toast.LENGTH_SHORT).show();
    }
}