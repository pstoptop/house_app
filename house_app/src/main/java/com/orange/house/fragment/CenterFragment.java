package com.orange.house.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.orange.house.R;

/**
 * Created by Administrator on 2016/5/3.
 */
public class CenterFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.center_fragment,container,false);
        TextView tv_center_content = (TextView) view.findViewById(R.id.tv_center_content);
        tv_center_content.setText("第一个Fragment");
        return view;
    }
}



