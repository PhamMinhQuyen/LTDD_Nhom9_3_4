package com.example.appdatthucan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DonHangAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<DonHang> arrayDonHang;

    public  DonHangAdapter(Context context,int layout, List<DonHang> DHList){
        myContext= context;
        myLayout = layout;
        arrayDonHang= DHList;

    }

    @Override
    public int getCount() {
        return arrayDonHang.size();
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
        txtTen.setText(arrayDonHang.get(position).Ten);
        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewGia);
        txtGia.setText(arrayDonHang.get(position).Gia+ "");
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(arrayDonHang.get(position).Hinh);
        TextView txtDiachi = (TextView) convertView.findViewById(R.id.textViewDiachi);
        txtDiachi.setText(arrayDonHang.get(position).Diachi);
        return convertView;
    }
}
