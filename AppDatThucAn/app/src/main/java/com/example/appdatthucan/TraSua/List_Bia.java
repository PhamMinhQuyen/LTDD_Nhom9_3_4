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

public class List_Bia  extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_bia);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Bia.this, MainActivity.class);
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

        mangTraSua.add(new TraSua("Bia Tô Lão Đại","76 - 78 Đường 3 Tháng 2","7.7","1.2km",R.drawable.htbtld));
        mangTraSua.add(new TraSua("Vườn Bia Restaurant - Các Món Nhậu","128 - 130 Lê Thanh Nghị","4.7","0.7km",R.drawable.vb));
        mangTraSua.add(new TraSua("Giang Bia Tô Restaurant - Món Việt","26 Hoàng Văn Thụ","4.6","0.5km",R.drawable.gbt));
        mangTraSua.add(new TraSua("Đất Việt - Bia Tươi & Nhậu Bình Dân","45 Xô Viết Nghệ Tĩnh","4.3","1.2km",R.drawable.dv));
        mangTraSua.add(new TraSua("Sky Beer - Nhà Hàng Bia Đức","41 - 42 - 43 Nguyễn Phước Lan","4.3","1.2km",R.drawable.sb));
        mangTraSua.add(new TraSua("Bia Tô - Đống Đa","224 Đống Đa","4.3","1.2km",R.drawable.bt));
        mangTraSua.add(new TraSua("Up StreetCocktail - Bia Úp Ngược","126 Đường 2 Tháng 9","4.3","1.2km",R.drawable.up_s));
        mangTraSua.add(new TraSua("Vườn Bia - Các Món Nhậu","01 Ngô Thì Nhậm","4.3","1.2km",R.drawable.vb_cmn));
        mangTraSua.add(new TraSua("Bia Tươi Sài Gòn","277 Yên Khê 2","4.3","1.2km",R.drawable.bt_sg));
        mangTraSua.add(new TraSua("Bia Tiệp 77 - Hải Sản Tươi Sống","Lô 12-B, Ngã Tư Loseby","4.3","1.2km",R.drawable.bt77));

        mangTraSua1.add(new TraSua("Bia Tô Lão Đại","76 - 78 Đường 3 Tháng 2","7.7","1.2km",R.drawable.htbtld));
        mangTraSua1.add(new TraSua("Vườn Bia Restaurant - Các Món Nhậu","128 - 130 Lê Thanh Nghị","4.7","0.7km",R.drawable.vb));
        mangTraSua1.add(new TraSua("Giang Bia Tô Restaurant - Món Việt","26 Hoàng Văn Thụ","4.6","0.5km",R.drawable.gbt));
        mangTraSua1.add(new TraSua("Đất Việt - Bia Tươi & Nhậu Bình Dân","45 Xô Viết Nghệ Tĩnh","4.3","1.2km",R.drawable.dv));
        mangTraSua1.add(new TraSua("Sky Beer - Nhà Hàng Bia Đức","41 - 42 - 43 Nguyễn Phước Lan","4.3","1.2km",R.drawable.sb));
        mangTraSua1.add(new TraSua("Bia Tô - Đống Đa","224 Đống Đa","4.3","1.2km",R.drawable.bt));
        mangTraSua1.add(new TraSua("Up StreetCocktail - Bia Úp Ngược","126 Đường 2 Tháng 9","4.3","1.2km",R.drawable.up_s));
        mangTraSua1.add(new TraSua("Vườn Bia - Các Món Nhậu","01 Ngô Thì Nhậm","4.3","1.2km",R.drawable.vb_cmn));
        mangTraSua1.add(new TraSua("Bia Tươi Sài Gòn","277 Yên Khê 2","4.3","1.2km",R.drawable.bt_sg));
        mangTraSua1.add(new TraSua("Bia Tiệp 77 - Hải Sản Tươi Sống","Lô 12-B, Ngã Tư Loseby","4.3","1.2km",R.drawable.bt77));


        mangTraSua2.add(new TraSua("Bia Tô Lão Đại","76 - 78 Đường 3 Tháng 2","7.7","1.2km",R.drawable.htbtld));
        mangTraSua2.add(new TraSua("Vườn Bia Restaurant - Các Món Nhậu","128 - 130 Lê Thanh Nghị","4.7","0.7km",R.drawable.vb));
        mangTraSua2.add(new TraSua("Giang Bia Tô Restaurant - Món Việt","26 Hoàng Văn Thụ","4.6","0.5km",R.drawable.gbt));
        mangTraSua2.add(new TraSua("Đất Việt - Bia Tươi & Nhậu Bình Dân","45 Xô Viết Nghệ Tĩnh","4.3","1.2km",R.drawable.dv));
        mangTraSua2.add(new TraSua("Sky Beer - Nhà Hàng Bia Đức","41 - 42 - 43 Nguyễn Phước Lan","4.3","1.2km",R.drawable.sb));
        mangTraSua2.add(new TraSua("Bia Tô - Đống Đa","224 Đống Đa","4.3","1.2km",R.drawable.bt));
        mangTraSua2.add(new TraSua("Up StreetCocktail - Bia Úp Ngược","126 Đường 2 Tháng 9","4.3","1.2km",R.drawable.up_s));
        mangTraSua2.add(new TraSua("Vườn Bia - Các Món Nhậu","01 Ngô Thì Nhậm","4.3","1.2km",R.drawable.vb_cmn));
        mangTraSua2.add(new TraSua("Bia Tươi Sài Gòn","277 Yên Khê 2","4.3","1.2km",R.drawable.bt_sg));
        mangTraSua2.add(new TraSua("Bia Tiệp 77 - Hải Sản Tươi Sống","Lô 12-B, Ngã Tư Loseby","4.3","1.2km",R.drawable.bt77));

        mangTraSua3.add(new TraSua("Bia Tô Lão Đại","76 - 78 Đường 3 Tháng 2","7.7","1.2km",R.drawable.htbtld));
        mangTraSua3.add(new TraSua("Vườn Bia Restaurant - Các Món Nhậu","128 - 130 Lê Thanh Nghị","4.7","0.7km",R.drawable.vb));
        mangTraSua3.add(new TraSua("Giang Bia Tô Restaurant - Món Việt","26 Hoàng Văn Thụ","4.6","0.5km",R.drawable.gbt));
        mangTraSua3.add(new TraSua("Đất Việt - Bia Tươi & Nhậu Bình Dân","45 Xô Viết Nghệ Tĩnh","4.3","1.2km",R.drawable.dv));
        mangTraSua3.add(new TraSua("Sky Beer - Nhà Hàng Bia Đức","41 - 42 - 43 Nguyễn Phước Lan","4.3","1.2km",R.drawable.sb));
        mangTraSua3.add(new TraSua("Bia Tô - Đống Đa","224 Đống Đa","4.3","1.2km",R.drawable.bt));
        mangTraSua3.add(new TraSua("Up StreetCocktail - Bia Úp Ngược","126 Đường 2 Tháng 9","4.3","1.2km",R.drawable.up_s));
        mangTraSua3.add(new TraSua("Vườn Bia - Các Món Nhậu","01 Ngô Thì Nhậm","4.3","1.2km",R.drawable.vb_cmn));
        mangTraSua3.add(new TraSua("Bia Tươi Sài Gòn","277 Yên Khê 2","4.3","1.2km",R.drawable.bt_sg));
        mangTraSua3.add(new TraSua("Bia Tiệp 77 - Hải Sản Tươi Sống","Lô 12-B, Ngã Tư Loseby","4.3","1.2km",R.drawable.bt77));

        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Bia.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Bia.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Bia.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Bia.this ,R.layout.dong_food_custom,mangTraSua3
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
