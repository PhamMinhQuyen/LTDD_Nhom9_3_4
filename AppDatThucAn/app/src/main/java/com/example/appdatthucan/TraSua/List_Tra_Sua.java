package com.example.appdatthucan.TraSua;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdatthucan.MainActivity;
import com.example.appdatthucan.R;

import java.util.ArrayList;

public class List_Tra_Sua  extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_trasua);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Tra_Sua.this, MainActivity.class);
                startActivity(intent);
            }
        });

        lvTraSua= (ListView)findViewById(R.id.ListviewTraSua);
        lvTraSua1= (ListView)findViewById(R.id.ListviewTraSua1);
        lvTraSua2= (ListView)findViewById(R.id.ListviewTraSua2);
        lvTraSua3= (ListView)findViewById(R.id.ListviewTraSua3);
        mangTraSua = new ArrayList<TraSua>();
        mangTraSua1 = new ArrayList<TraSua>();
        mangTraSua2 = new ArrayList<TraSua>();
        mangTraSua3 = new ArrayList<TraSua>();
        //thêm vào mảng trà sữa

        mangTraSua.add(new TraSua("Trà Sữa Caramel","Trường Chinh","4.3","1.2km",R.drawable.tra_sua_caramel));
        mangTraSua.add(new TraSua("Trà Sữa Khoai Môn","12 Hoàng Hoa Thám","4.7","1.7km",R.drawable.trkm));
        mangTraSua.add(new TraSua("Trà Sữa MatCha Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trdd));
        mangTraSua.add(new TraSua("Trà Sữa Pudding Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trpdd));
        mangTraSua.add(new TraSua("Trà Xoài Kem Cheese","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tx));
        mangTraSua.add(new TraSua("Trà Sữa Trân Châu Trắng","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsctt));
        mangTraSua.add(new TraSua("Trà Sữa Earl Grey","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tseg));
        mangTraSua.add(new TraSua("Trà Sữa Matcha","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsmc));
        mangTraSua.add(new TraSua("Trà Sữa Oreo Cake Cream","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trocc));
        mangTraSua.add(new TraSua("Bếp Chú Gà-Ăn Vặt & Trà Sữa","05 Nguyễn Văn Thoại","4.3","1.2km",R.drawable.bcg));

        mangTraSua1.add(new TraSua("Trà Sữa Caramel","Trường Chinh","4.3","1.2km",R.drawable.tra_sua_caramel));
        mangTraSua1.add(new TraSua("Trà Sữa Khoai Môn","12 Hoàng Hoa Thám","4.7","1.7km",R.drawable.trkm));
        mangTraSua1.add(new TraSua("Trà Sữa MatCha Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trdd));
        mangTraSua1.add(new TraSua("Trà Sữa Pudding Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trpdd));
        mangTraSua1.add(new TraSua("Trà Xoài Kem Cheese","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tx));
        mangTraSua1.add(new TraSua("Trà Sữa Trân Châu Trắng","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsctt));
        mangTraSua1.add(new TraSua("Trà Sữa Earl Grey","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tseg));
        mangTraSua1.add(new TraSua("Trà Sữa Matcha","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsmc));
        mangTraSua1.add(new TraSua("Trà Sữa Oreo Cake Cream","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trocc));
        mangTraSua1.add(new TraSua("Bếp Chú Gà-Ăn Vặt & Trà Sữa","05 Nguyễn Văn Thoại","4.3","1.2km",R.drawable.bcg));


        mangTraSua2.add(new TraSua("Trà Sữa Caramel","Trường Chinh","4.3","1.2km",R.drawable.tra_sua_caramel));
        mangTraSua2.add(new TraSua("Trà Sữa Khoai Môn","12 Hoàng Hoa Thám","4.7","1.7km",R.drawable.trkm));
        mangTraSua2.add(new TraSua("Trà Sữa MatCha Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trdd));
        mangTraSua2.add(new TraSua("Trà Sữa Pudding Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trpdd));
        mangTraSua2.add(new TraSua("Trà Xoài Kem Cheese","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tx));
        mangTraSua2.add(new TraSua("Trà Sữa Trân Châu Trắng","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsctt));
        mangTraSua2.add(new TraSua("Trà Sữa Earl Grey","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tseg));
        mangTraSua2.add(new TraSua("Trà Sữa Matcha","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsmc));
        mangTraSua2.add(new TraSua("Trà Sữa Oreo Cake Cream","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trocc));
        mangTraSua2.add(new TraSua("Bếp Chú Gà-Ăn Vặt & Trà Sữa","05 Nguyễn Văn Thoại","4.3","1.2km",R.drawable.bcg));

        mangTraSua3.add(new TraSua("Trà Sữa Caramel","Trường Chinh","4.3","1.2km",R.drawable.tra_sua_caramel));
        mangTraSua3.add(new TraSua("Trà Sữa Khoai Môn","12 Hoàng Hoa Thám","4.7","1.7km",R.drawable.trkm));
        mangTraSua3.add(new TraSua("Trà Sữa MatCha Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trdd));
        mangTraSua3.add(new TraSua("Trà Sữa Pudding Đậu Đở","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trpdd));
        mangTraSua3.add(new TraSua("Trà Xoài Kem Cheese","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tx));
        mangTraSua3.add(new TraSua("Trà Sữa Trân Châu Trắng","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsctt));
        mangTraSua3.add(new TraSua("Trà Sữa Earl Grey","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tseg));
        mangTraSua3.add(new TraSua("Trà Sữa Matcha","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.tsmc));
        mangTraSua3.add(new TraSua("Trà Sữa Oreo Cake Cream","12 Hoàng Hoa Thám","4.3","1.2km",R.drawable.trocc));
        mangTraSua3.add(new TraSua("Bếp Chú Gà-Ăn Vặt & Trà Sữa","05 Nguyễn Văn Thoại","4.3","1.2km",R.drawable.bcg));


        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Tra_Sua.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Tra_Sua.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Tra_Sua.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Tra_Sua.this ,R.layout.dong_food_custom,mangTraSua3
        );
        lvTraSua3.setAdapter(suaAdapter3);


        //bắt đầu tabhost
        TabHost tabhost1 = (TabHost) findViewById(R.id.tabhost1);

        // setting up the tab host
        tabhost1.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec1 = tabhost1.newTabSpec("Gần tôi");
        spec1.setContent(R.id.tab11 );

        // setting the name of the tab 1 as "Tab One"
        spec1.setIndicator("Gần tôi");

        //thêm  tab vào tabhost
        tabhost1.addTab(spec1);

        // Code thêm Tab 2 vào tabhost
        spec1 = tabhost1.newTabSpec("Bán chạy");
        spec1.setContent(R.id.tab22);

        // setting the name of the tab 1 as "Tab Two"
        spec1.setIndicator("Bán chạy");
        tabhost1.addTab(spec1);

        // Code thêm Tab 3 vào  tabhost
        spec1 = tabhost1.newTabSpec("Giao nhanh");
        spec1.setContent(R.id.tab33);
        spec1.setIndicator("Giao nhanh");
        tabhost1.addTab(spec1);

        // Code thêm Tab 4 vào  tabhost
        spec1 = tabhost1.newTabSpec("Đánh giá");
        spec1.setContent(R.id.tab44);
        spec1.setIndicator("Đánh giá");
        tabhost1.addTab(spec1);
    }
}
