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

public class  List_Ga_Ran  extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_ga_ran);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Ga_Ran.this, MainActivity.class);
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

        mangTraSua.add(new TraSua("Gà Rán KDC","Trần Cao Vân","7.7","1.2km",R.drawable.kdc));
        mangTraSua.add(new TraSua("Yoon Mama-Gà Rán Hàn Quốc","12 Lê Đình Dương","4.7","0.7km",R.drawable.grhq));
        mangTraSua.add(new TraSua("Gà Rán Đống Đa- Chi Nhánh Đống Đa","118 Đống Đa","4.6","0.5km",R.drawable.grdd));
        mangTraSua.add(new TraSua("Chick & Go - Gà Rán Và Xiên Que Nhật Bản","223 Đống Đa","4.3","1.2km",R.drawable.c_g));
        mangTraSua.add(new TraSua("Uncle Chicken - Nhà Hàng Gà Rán Hàn Quốc","Lô 22 Khu H1 Phạm Văn Đồng","4.3","1.2km",R.drawable.uc));
        mangTraSua.add(new TraSua("Hong Cha - Gà Rán & Trà Xí Muội Hàn Quốc","288 Đống Đa","4.3","1.2km",R.drawable.hc));
        mangTraSua.add(new TraSua("Ăn Vặt Gà Rán & Cơm Our - Shop Online","31 Thanh Tịnh","4.3","1.2km",R.drawable.avgr));
        mangTraSua.add(new TraSua("Gà Rán Popeyes ","Lê Duẩn","4.3","1.2km",R.drawable.grp));
        mangTraSua.add(new TraSua("Kammui - Khoai Lang & Gà Rán","239 Trần Cao Vân","4.3","1.2km",R.drawable.k));
        mangTraSua.add(new TraSua("Vons Chicken - Gà Rán & Tokbokki","Dương Đình Nghệ","4.3","1.2km",R.drawable.vc));

        mangTraSua1.add(new TraSua("Gà Rán KDC","Trần Cao Vân","7.7","1.2km",R.drawable.kdc));
        mangTraSua1.add(new TraSua("Yoon Mama-Gà Rán Hàn Quốc","12 Lê Đình Dương","4.7","0.7km",R.drawable.grhq));
        mangTraSua1.add(new TraSua("Gà Rán Đống Đa- Chi Nhánh Đống Đa","118 Đống Đa","4.6","0.5km",R.drawable.grdd));
        mangTraSua1.add(new TraSua("Chick & Go - Gà Rán Và Xiên Que Nhật Bản","223 Đống Đa","4.3","1.2km",R.drawable.c_g));
        mangTraSua1.add(new TraSua("Uncle Chicken - Nhà Hàng Gà Rán Hàn Quốc","Lô 22 Khu H1 Phạm Văn Đồng","4.3","1.2km",R.drawable.uc));
        mangTraSua1.add(new TraSua("Hong Cha - Gà Rán & Trà Xí Muội Hàn Quốc","288 Đống Đa","4.3","1.2km",R.drawable.hc));
        mangTraSua1.add(new TraSua("Ăn Vặt Gà Rán & Cơm Our - Shop Online","31 Thanh Tịnh","4.3","1.2km",R.drawable.avgr));
        mangTraSua1.add(new TraSua("Gà Rán Popeyes ","Lê Duẩn","4.3","1.2km",R.drawable.grp));
        mangTraSua1.add(new TraSua("Kammui - Khoai Lang & Gà Rán","239 Trần Cao Vân","4.3","1.2km",R.drawable.k));
        mangTraSua1.add(new TraSua("Vons Chicken - Gà Rán & Tokbokki","Dương Đình Nghệ","4.3","1.2km",R.drawable.vc));


        mangTraSua2.add(new TraSua("Gà Rán KDC","Trần Cao Vân","7.7","1.2km",R.drawable.kdc));
        mangTraSua2.add(new TraSua("Yoon Mama-Gà Rán Hàn Quốc","12 Lê Đình Dương","4.7","0.7km",R.drawable.grhq));
        mangTraSua2.add(new TraSua("Gà Rán Đống Đa- Chi Nhánh Đống Đa","118 Đống Đa","4.6","0.5km",R.drawable.grdd));
        mangTraSua2.add(new TraSua("Chick & Go - Gà Rán Và Xiên Que Nhật Bản","223 Đống Đa","4.3","1.2km",R.drawable.c_g));
        mangTraSua2.add(new TraSua("Uncle Chicken - Nhà Hàng Gà Rán Hàn Quốc","Lô 22 Khu H1 Phạm Văn Đồng","4.3","1.2km",R.drawable.uc));
        mangTraSua2.add(new TraSua("Hong Cha - Gà Rán & Trà Xí Muội Hàn Quốc","288 Đống Đa","4.3","1.2km",R.drawable.hc));
        mangTraSua2.add(new TraSua("Ăn Vặt Gà Rán & Cơm Our - Shop Online","31 Thanh Tịnh","4.3","1.2km",R.drawable.avgr));
        mangTraSua2.add(new TraSua("Gà Rán Popeyes ","Lê Duẩn","4.3","1.2km",R.drawable.grp));
        mangTraSua2.add(new TraSua("Kammui - Khoai Lang & Gà Rán","239 Trần Cao Vân","4.3","1.2km",R.drawable.k));
        mangTraSua2.add(new TraSua("Vons Chicken - Gà Rán & Tokbokki","Dương Đình Nghệ","4.3","1.2km",R.drawable.vc));

        mangTraSua3.add(new TraSua("Gà Rán KDC","Trần Cao Vân","7.7","1.2km",R.drawable.kdc));
        mangTraSua3.add(new TraSua("Yoon Mama-Gà Rán Hàn Quốc","12 Lê Đình Dương","4.7","0.7km",R.drawable.grhq));
        mangTraSua3.add(new TraSua("Gà Rán Đống Đa- Chi Nhánh Đống Đa","118 Đống Đa","4.6","0.5km",R.drawable.grdd));
        mangTraSua3.add(new TraSua("Chick & Go - Gà Rán Và Xiên Que Nhật Bản","223 Đống Đa","4.3","1.2km",R.drawable.c_g));
        mangTraSua3.add(new TraSua("Uncle Chicken - Nhà Hàng Gà Rán Hàn Quốc","Lô 22 Khu H1 Phạm Văn Đồng","4.3","1.2km",R.drawable.uc));
        mangTraSua3.add(new TraSua("Hong Cha - Gà Rán & Trà Xí Muội Hàn Quốc","288 Đống Đa","4.3","1.2km",R.drawable.hc));
        mangTraSua3.add(new TraSua("Ăn Vặt Gà Rán & Cơm Our - Shop Online","31 Thanh Tịnh","4.3","1.2km",R.drawable.avgr));
        mangTraSua3.add(new TraSua("Gà Rán Popeyes ","Lê Duẩn","4.3","1.2km",R.drawable.grp));
        mangTraSua3.add(new TraSua("Kammui - Khoai Lang & Gà Rán","239 Trần Cao Vân","4.3","1.2km",R.drawable.k));
        mangTraSua3.add(new TraSua("Vons Chicken - Gà Rán & Tokbokki","Dương Đình Nghệ","4.3","1.2km",R.drawable.vc));


        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Ga_Ran.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Ga_Ran.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Ga_Ran.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Ga_Ran.this ,R.layout.dong_food_custom,mangTraSua3
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
