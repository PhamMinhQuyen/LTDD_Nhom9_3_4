package com.example.appdatthucan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomerAdapter_ThBao extends BaseAdapter {
    Context context;
    ArrayList<product_tbao> Data;
    LayoutInflater layoutInflater;
    product_tbao model;

    public CustomerAdapter_ThBao(Context context, ArrayList<product_tbao> data) {
        this.context = context;
        this.Data = data;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return Data.size();
    }

    @Override
    public Object getItem(int position) {
        return Data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return Data.get(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View rowView = view;
        if(rowView==null){
            rowView=layoutInflater.inflate(R.layout.activity_product_tbao,null,true);
        }

        ImageView image = rowView.findViewById(R.id.product_img);
        TextView title = rowView.findViewById(R.id.product_title);
        TextView chi_tiet = rowView.findViewById(R.id.product_chi_tiet);
        TextView time = rowView.findViewById(R.id.product_time);


        model=Data.get(position);
        image.setImageResource(model.getImage());
        title.setText(model.getTitle());
        chi_tiet.setText(model.getChi_tiet());
        time.setText(model.getTime());


        return rowView;
    }
}
