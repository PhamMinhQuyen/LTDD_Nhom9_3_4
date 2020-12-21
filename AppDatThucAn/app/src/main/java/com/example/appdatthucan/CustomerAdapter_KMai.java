package com.example.appdatthucan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomerAdapter_KMai extends BaseAdapter {
    Context context;
    int Layout;
    List<product_khuyenmai> arrayList;

    public CustomerAdapter_KMai(Context context, int layout, List<product_khuyenmai> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView tvTitle;
        TextView tvChiTiet;
        TextView tvTime;
        ImageView imgHinhAnh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout,null);
            viewHolder=new ViewHolder();
            //
            viewHolder.tvTitle=(TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tvChiTiet=(TextView) convertView.findViewById(R.id.tv_chi_tiet);
            viewHolder.tvTime=(TextView) convertView.findViewById(R.id.tv_time);

            viewHolder.imgHinhAnh=(ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //
        viewHolder.tvTitle.setText(arrayList.get(position).title);
        viewHolder.tvChiTiet.setText(arrayList.get(position).chi_tiet);
        viewHolder.tvTime.setText(arrayList.get(position).time);

        viewHolder.imgHinhAnh.setImageResource(arrayList.get(position).image);
        return convertView;
    }
}
