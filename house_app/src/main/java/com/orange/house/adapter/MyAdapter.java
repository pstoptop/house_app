package com.orange.house.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.orange.house.R;

import java.util.List;

/**
 * Created by Administrator on 2016/5/19.
 */
public class MyAdapter extends BaseAdapter {

    private List<House> mHouse;
    private Context mContext;

    public MyAdapter(List<House> mHouse, Context mContext) {
        this.mHouse = mHouse;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mHouse.size();
    }

    @Override
    public Object getItem(int position) {
        return mHouse.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.house_list_item, parent, false);
            viewHolder.iv_logo = (ImageView) convertView.findViewById(R.id.iv_logo);
            viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.tv_address = (TextView) convertView.findViewById(R.id.tv_address);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.iv_logo.setImageResource(R.mipmap.ic_launcher);
        viewHolder.tv_name.setText(mHouse.get(position).getHouse_title());
        viewHolder.tv_address.setText(mHouse.get(position).getHouse_content());

        return convertView;
    }

    private class ViewHolder {

        ImageView iv_logo;
        TextView tv_name;
        TextView tv_address;
    }


}
