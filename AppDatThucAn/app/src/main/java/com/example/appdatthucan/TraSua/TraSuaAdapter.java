package com.example.appdatthucan.TraSua;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appdatthucan.R;
import com.example.appdatthucan.TraSua.TraSua;

import java.util.List;

public class TraSuaAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<TraSua> arrayTraSua;

    public  TraSuaAdapter(Context context,int layout, List<TraSua> traSuaList){
        myContext= context;
        myLayout = layout;
        arrayTraSua= traSuaList;

    }

    @Override
    public int getCount() {
        return arrayTraSua.size();
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
        txtTen.setText(arrayTraSua.get(position).Ten);
        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewDiachi);
        txtGia.setText(arrayTraSua.get(position).Diachi);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageViewHinh);
        imgHinh.setImageResource(arrayTraSua.get(position).Hinh);
        TextView txtDiachi = (TextView) convertView.findViewById(R.id.textViewSao);
        txtDiachi.setText(arrayTraSua.get(position).Sao);
        TextView txtKM = (TextView) convertView.findViewById(R.id.textViewKm);
        txtKM.setText(arrayTraSua.get(position).Km);
        return convertView;
    }
}
