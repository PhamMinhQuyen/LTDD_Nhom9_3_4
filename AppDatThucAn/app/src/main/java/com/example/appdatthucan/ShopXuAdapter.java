package com.example.appdatthucan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ShopXuAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<ShopXu> arrayXu;

    public ShopXuAdapter(Context myContext, int myLayout, List<ShopXu> arrayXu) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrayXu = arrayXu;
    }


    @Override
    public int getCount() {
        return arrayXu.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout,null);

        // Anhs Xạ và Gán Gía Trị
        TextView txtTen =(TextView) convertView.findViewById(R.id.textViewTen);
        txtTen.setText(arrayXu.get(position).Ten);
        TextView txtXu= (TextView) convertView.findViewById(R.id.textViewXu);
        txtXu.setText(arrayXu.get(position).Xu);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(arrayXu.get(position).Hinh);
        TextView txtThoiGian = (TextView) convertView.findViewById(R.id.textViewThoiGian);
        txtThoiGian.setText(arrayXu.get(position).Thoigian);

        return convertView;
    }
}