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

public class List_Thuoc   extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_thuoc);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Thuoc.this, MainActivity.class);
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

        mangTraSua.add(new TraSua("Quán Hà - Gà Ác Tần Thuốc Bắc","131/9 Lý Thái Tổ","7.7","1.2km",R.drawable.qh));
        mangTraSua.add(new TraSua("Rượu Thuốc Ông Thầy","60 Duy Tân","4.7","0.7km",R.drawable.rtot));
        mangTraSua.add(new TraSua("Rượu Võ Xá - Rượu Thuốc","11 Phước Mỹ 3, P. Phước Mỹ","4.6","0.5km",R.drawable.rvx));
        mangTraSua.add(new TraSua("Gà Ác Ngũ Trảo & Yến Chưng","260 Trưng Nữ Vương","4.3","1.2km",R.drawable.gant));
        mangTraSua.add(new TraSua("Bồ Câu - Gà Ác","91 Nguyễn Hữu Thọ","4.3","1.2km",R.drawable.bc));

        mangTraSua1.add(new TraSua("Quán Hà - Gà Ác Tần Thuốc Bắc","131/9 Lý Thái Tổ","7.7","1.2km",R.drawable.qh));
        mangTraSua1.add(new TraSua("Rượu Thuốc Ông Thầy","60 Duy Tân","4.7","0.7km",R.drawable.rtot));
        mangTraSua1.add(new TraSua("Rượu Võ Xá - Rượu Thuốc","11 Phước Mỹ 3, P. Phước Mỹ","4.6","0.5km",R.drawable.rvx));
        mangTraSua1.add(new TraSua("Gà Ác Ngũ Trảo & Yến Chưng","260 Trưng Nữ Vương","4.3","1.2km",R.drawable.gant));
        mangTraSua1.add(new TraSua("Bồ Câu - Gà Ác","91 Nguyễn Hữu Thọ","4.3","1.2km",R.drawable.bc));

        mangTraSua2.add(new TraSua("Quán Hà - Gà Ác Tần Thuốc Bắc","131/9 Lý Thái Tổ","7.7","1.2km",R.drawable.qh));
        mangTraSua2.add(new TraSua("Rượu Thuốc Ông Thầy","60 Duy Tân","4.7","0.7km",R.drawable.rtot));
        mangTraSua2.add(new TraSua("Rượu Võ Xá - Rượu Thuốc","11 Phước Mỹ 3, P. Phước Mỹ","4.6","0.5km",R.drawable.rvx));
        mangTraSua2.add(new TraSua("Gà Ác Ngũ Trảo & Yến Chưng","260 Trưng Nữ Vương","4.3","1.2km",R.drawable.gant));
        mangTraSua2.add(new TraSua("Bồ Câu - Gà Ác","91 Nguyễn Hữu Thọ","4.3","1.2km",R.drawable.bc));
        mangTraSua2.add(new TraSua("Vons Chicken - Gà Rán & Tokbokki","Dương Đình Nghệ","4.3","1.2km",R.drawable.vc));

        mangTraSua3.add(new TraSua("Quán Hà - Gà Ác Tần Thuốc Bắc","131/9 Lý Thái Tổ","7.7","1.2km",R.drawable.qh));
        mangTraSua3.add(new TraSua("Rượu Thuốc Ông Thầy","60 Duy Tân","4.7","0.7km",R.drawable.rtot));
        mangTraSua3.add(new TraSua("Rượu Võ Xá - Rượu Thuốc","11 Phước Mỹ 3, P. Phước Mỹ","4.6","0.5km",R.drawable.rvx));
        mangTraSua3.add(new TraSua("Gà Ác Ngũ Trảo & Yến Chưng","260 Trưng Nữ Vương","4.3","1.2km",R.drawable.gant));
        mangTraSua3.add(new TraSua("Bồ Câu - Gà Ác","91 Nguyễn Hữu Thọ","4.3","1.2km",R.drawable.bc));

        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Thuoc.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Thuoc.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Thuoc.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Thuoc.this ,R.layout.dong_food_custom,mangTraSua3
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
