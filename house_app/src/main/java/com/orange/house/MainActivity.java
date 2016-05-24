package com.orange.house;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.orange.house.fragment.CenterFragment;
import com.orange.house.fragment.HouseFragment;
import com.orange.house.fragment.MineFragment;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private FrameLayout frameLayout;


    //定义3个Fragment的对象
    private HouseFragment houseFragment;
    private CenterFragment centerFragment;
    private MineFragment mineFragment;

    //定义底部导航栏的三个布局
    private RelativeLayout rl_center;
    private RelativeLayout rl_tab1;
    private RelativeLayout rl_tab2;

    //定义底部导航栏中的ImageView与TextView
    private TextView tv_center;
    private TextView tv_tab1;
    private TextView tv_tab2;

    private ImageView iv_center;
    private ImageView iv_tab1;
    private ImageView iv_tab2;

    //定义FragmentManager对象
    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;

    //定义要用的颜色值
    private int whirt = 0xFFFFFFFF;
    private int gray = 0xFF7597B3;
    private int blue =0xFF0AB2FB;
    private int yellow= 0xFFEA8010;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        fragmentManager = getSupportFragmentManager();

        setChioceItem(1);

    }


    //初始化组件
    private void initView() {

        iv_tab1 = (ImageView) findViewById(R.id.iv_tab1);
        iv_center = (ImageView) findViewById(R.id.iv_center);
        iv_tab2 = (ImageView) findViewById(R.id.iv_tab2);

        tv_tab1 = (TextView) findViewById(R.id.tv_tab1);
        tv_center = (TextView) findViewById(R.id.tv_center);
        tv_tab2 = (TextView) findViewById(R.id.tv_tab2);

        rl_tab1 = (RelativeLayout) findViewById(R.id.rl_tab1);
        rl_center = (RelativeLayout) findViewById(R.id.rl_center);
        rl_tab2 = (RelativeLayout) findViewById(R.id.rl_tab2);

        rl_tab1.setOnClickListener(this);
        rl_tab2.setOnClickListener(this);
        rl_center.setOnClickListener(this);


    }

    //重写onClick事件
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rl_tab1:
                setChioceItem(0);
                break;
            case R.id.rl_center:
                setChioceItem(1);
                break;
            case R.id.rl_tab2:
                setChioceItem(2);
                break;
        }

    }


    public void setChioceItem(int index) {

        FragmentTransaction transaction = fragmentManager.beginTransaction();

        clearChioce();

        hideFragments(transaction);
        switch (index) {
            case 0:
                iv_tab1.setImageResource(R.mipmap.ic_tabbar_order_pressed);
                tv_tab1.setTextColor(yellow);
                //        rl_tab1.setBackgroundResource(R.drawable.ic_tabbar_bg_click);
                if (houseFragment == null) {

                    // 如果houseFragment为空，则创建一个并添加到界面上
                    houseFragment = new HouseFragment();
                    transaction.add(R.id.fragment, houseFragment);
                } else {

                    // 如果houseFragment不为空，则直接将它显示出来
                    transaction.show(houseFragment);
                }
                break;
            case 1:
                iv_center.setImageResource(R.mipmap.ic_tabbar_center_pressed);
                tv_center.setTextColor(yellow);
          //      tv_center.setTextColor(yellow);
                //       rl_center.setBackgroundResource(R.drawable.ic_tabbar_bg_click);
                if (centerFragment == null) {
                    centerFragment = new CenterFragment();
                    transaction.add(R.id.fragment, centerFragment);
                } else {
                    transaction.show(centerFragment);
                }
                break;
            case 2:
                iv_tab2.setImageResource(R.mipmap.ic_tabbar_setting_me_pressed);
                tv_tab2.setTextColor(yellow);
                //      rl_tab2.setBackgroundResource(R.drawable.ic_tabbar_bg_click);
                if (mineFragment == null) {
                    mineFragment = new MineFragment();
                    transaction.add(R.id.fragment, mineFragment);
                } else {
                    transaction.show(mineFragment);
                }
                break;
        }
        transaction.commit();
    }

    //隐藏所有的Fragment,避免fragment混乱
    private void hideFragments(FragmentTransaction transaction) {
        if (houseFragment != null) {
            transaction.hide(houseFragment);
        }
        if (centerFragment != null) {
            transaction.hide(centerFragment);
        }
        if (mineFragment != null) {
            transaction.hide(mineFragment);
        }
    }

    //定义一个重置所有选项的方法
    public void clearChioce() {
        iv_tab1.setImageResource(R.mipmap.ic_tabbar_order_normal);
        rl_tab1.setBackgroundColor(0xFFFFFFFF);
        tv_tab1.setTextColor(0xFF7597B3);
        iv_center.setImageResource(R.mipmap.ic_tabbar_center_normal);
        rl_center.setBackgroundColor(0xFFFFFFFF);
        tv_center.setTextColor(0xFF7597B3);
        iv_tab2.setImageResource(R.mipmap.ic_tabbar_setting_me_normal);
        rl_tab2.setBackgroundColor(0xFFFFFFFF);
        tv_tab2.setTextColor(0xFF7597B3);
    }



}
