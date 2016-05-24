package com.orange.house.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.support.v4.app.Fragment;
import com.orange.house.R;

/**
 * Created by Administrator on 2016/5/3.
 */
public class MineFragment  extends Fragment{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.mine_fragment,container,false);
        TextView tv_mine_content = (TextView) view.findViewById(R.id.tv_mine_content);
        tv_mine_content.setText("第三个Fragment");
        return view;
    }
}
