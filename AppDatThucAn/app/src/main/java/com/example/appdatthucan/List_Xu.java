package com.example.appdatthucan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class List_Xu extends AppCompatActivity {
    ArrayList<ShopXu> mang1,mang2,mang3;
    ListView lv1, lv2,lv3 ;
    Button tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list__xu);


        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Xu.this, ProfileUser.class);
                startActivity(intent);
            }
        });

        lv1= (ListView)findViewById(R.id.lv_all);
        lv2= (ListView)findViewById(R.id.lv_danhan);
        lv3= (ListView)findViewById(R.id.lv_dadung);
        mang1 = new ArrayList<ShopXu>();
        mang2 = new ArrayList<ShopXu>();
        mang3 = new ArrayList<ShopXu>();

        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","600", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","400", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.hethan,"01/04/2019"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","2000", R.drawable.shop,"01/01/2020"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.hethan,"01/04/2019"));
        mang1.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));

        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","-400", R.drawable.hethan,"01/04/2019"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/04/2019"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.hethan,"01/01/2020"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));
        mang2.add(new ShopXu("Giao dịch để nhận Shop Xu","1000", R.drawable.shop,"01/01/2020"));

        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.hethan,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-600", R.drawable.hethan,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.shop,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-1000", R.drawable.hethan,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-800", R.drawable.hethan,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-800", R.drawable.shop,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-800", R.drawable.hethan,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-800", R.drawable.shop,"01/04/2019"));
        mang3.add(new ShopXu("Giao dịch để nhận Shop Xu","-800", R.drawable.hethan,"01/04/2019"));



        ShopXuAdapter shopXuAdapter = new ShopXuAdapter(
                List_Xu.this ,
                R.layout.dong_xu,
                mang1
        );
        ShopXuAdapter shopXuAdapter1 = new ShopXuAdapter(
                List_Xu.this ,
                R.layout.dong_xu,
                mang2
        );
        ShopXuAdapter shopXuAdapter2 = new ShopXuAdapter(
                List_Xu.this ,
                R.layout.dong_xu,
                mang3
        );

        lv1.setAdapter(shopXuAdapter);
        lv2.setAdapter(shopXuAdapter1);
        lv3.setAdapter(shopXuAdapter2);

        //bắt đầu tabhost
        TabHost tabhost1 = (TabHost) findViewById(R.id.tabhost11);

        // setting up the tab host
        tabhost1.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec1 = tabhost1.newTabSpec("Tất cả");
        spec1.setContent(R.id.tab111 );

        // setting the name of the tab 1 as "Tab One"
        spec1.setIndicator("Tất cả");

        //thêm  tab vào tabhost
        tabhost1.addTab(spec1);

        // Code thêm Tab 2 vào tabhost
        spec1 = tabhost1.newTabSpec("Đã nhận");
        spec1.setContent(R.id.tab222);

        // setting the name of the tab 1 as "Tab Two"
        spec1.setIndicator("Đã nhận");
        tabhost1.addTab(spec1);

        // Code thêm Tab 3 vào  tabhost
        spec1 = tabhost1.newTabSpec("Đã dùng");
        spec1.setContent(R.id.tab333);
        spec1.setIndicator("Đã dùng");
        tabhost1.addTab(spec1);
    }
}