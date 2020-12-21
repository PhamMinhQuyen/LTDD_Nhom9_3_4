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

public class List_Banh  extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_banh);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Banh.this, MainActivity.class);
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

        mangTraSua.add(new TraSua("Bánh Xèo Bà Dưỡng","K280/23 Hoàng Diệu","4.7","1.2km",R.drawable.bxbd));
        mangTraSua.add(new TraSua("Bánh Căn - Bánh Đập","47 Đỗ Quang","4.7","0.7km",R.drawable.bc_bd));
        mangTraSua.add(new TraSua("Bánh Bèo Bà Bé","100 Hoàng Văn Thụ","4.6","0.5km",R.drawable.bbbb));
        mangTraSua.add(new TraSua("Quán Trần - Đặc Sản Đà Nẵng","Hải Phòng","4.3","1.2km",R.drawable.htqt));
        mangTraSua.add(new TraSua("Bánh Tráng Kẹp Dì Hoa","62/2A Núi Thành","4.3","1.2km",R.drawable.btkdh));
        mangTraSua.add(new TraSua("Bánh Waffle - Bánh Nướng Tổ Ong","174 Phan Châu Trinh","4.3","1.2km",R.drawable.bw));
        mangTraSua.add(new TraSua("Bánh Mì & Bánh Cuốn Liên","34 Nguyễn Thị Minh Khai","4.3","1.2km",R.drawable.bm));
        mangTraSua.add(new TraSua("Tiệm Bánh Mr.C","74 Thái Phiên","4.3","1.2km",R.drawable.tb));
        mangTraSua.add(new TraSua("Bánh Canh Cá Nướng","Lê Văn Duyệt, P. Nại Hiên Đông","4.3","1.2km",R.drawable.bccn));
        mangTraSua.add(new TraSua("Bánh Tráng Trộn Dì Hằng","2 Hải Phòng","4.3","1.2km",R.drawable.bttdh));

        mangTraSua1.add(new TraSua("Bánh Xèo Bà Dưỡng","K280/23 Hoàng Diệu","4.7","1.2km",R.drawable.bxbd));
        mangTraSua1.add(new TraSua("Bánh Căn - Bánh Đập","47 Đỗ Quang","4.7","0.7km",R.drawable.bc_bd));
        mangTraSua1.add(new TraSua("Bánh Bèo Bà Bé","100 Hoàng Văn Thụ","4.6","0.5km",R.drawable.bbbb));
        mangTraSua1.add(new TraSua("Quán Trần - Đặc Sản Đà Nẵng","Hải Phòng","4.3","1.2km",R.drawable.htqt));
        mangTraSua1.add(new TraSua("Bánh Tráng Kẹp Dì Hoa","62/2A Núi Thành","4.3","1.2km",R.drawable.btkdh));
        mangTraSua1.add(new TraSua("Bánh Waffle - Bánh Nướng Tổ Ong","174 Phan Châu Trinh","4.3","1.2km",R.drawable.bw));
        mangTraSua1.add(new TraSua("Bánh Mì & Bánh Cuốn Liên","34 Nguyễn Thị Minh Khai","4.3","1.2km",R.drawable.bm));
        mangTraSua1.add(new TraSua("Tiệm Bánh Mr.C","74 Thái Phiên","4.3","1.2km",R.drawable.tb));
        mangTraSua1.add(new TraSua("Bánh Canh Cá Nướng","Lê Văn Duyệt, P. Nại Hiên Đông","4.3","1.2km",R.drawable.bccn));
        mangTraSua1.add(new TraSua("Bánh Tráng Trộn Dì Hằng","2 Hải Phòng","4.3","1.2km",R.drawable.bttdh));


        mangTraSua2.add(new TraSua("Bánh Xèo Bà Dưỡng","K280/23 Hoàng Diệu","4.7","1.2km",R.drawable.bxbd));
        mangTraSua2.add(new TraSua("Bánh Căn - Bánh Đập","47 Đỗ Quang","4.7","0.7km",R.drawable.bc_bd));
        mangTraSua2.add(new TraSua("Bánh Bèo Bà Bé","100 Hoàng Văn Thụ","4.6","0.5km",R.drawable.bbbb));
        mangTraSua2.add(new TraSua("Quán Trần - Đặc Sản Đà Nẵng","Hải Phòng","4.3","1.2km",R.drawable.htqt));
        mangTraSua2.add(new TraSua("Bánh Tráng Kẹp Dì Hoa","62/2A Núi Thành","4.3","1.2km",R.drawable.btkdh));
        mangTraSua2.add(new TraSua("Bánh Waffle - Bánh Nướng Tổ Ong","174 Phan Châu Trinh","4.3","1.2km",R.drawable.bw));
        mangTraSua2.add(new TraSua("Bánh Mì & Bánh Cuốn Liên","34 Nguyễn Thị Minh Khai","4.3","1.2km",R.drawable.bm));
        mangTraSua2.add(new TraSua("Tiệm Bánh Mr.C","74 Thái Phiên","4.3","1.2km",R.drawable.tb));
        mangTraSua2.add(new TraSua("Bánh Canh Cá Nướng","Lê Văn Duyệt, P. Nại Hiên Đông","4.3","1.2km",R.drawable.bccn));
        mangTraSua2.add(new TraSua("Bánh Tráng Trộn Dì Hằng","2 Hải Phòng","4.3","1.2km",R.drawable.bttdh));

        mangTraSua3.add(new TraSua("Bánh Xèo Bà Dưỡng","K280/23 Hoàng Diệu","4.7","1.2km",R.drawable.bxbd));
        mangTraSua3.add(new TraSua("Bánh Căn - Bánh Đập","47 Đỗ Quang","4.7","0.7km",R.drawable.bc_bd));
        mangTraSua3.add(new TraSua("Bánh Bèo Bà Bé","100 Hoàng Văn Thụ","4.6","0.5km",R.drawable.bbbb));
        mangTraSua3.add(new TraSua("Quán Trần - Đặc Sản Đà Nẵng","Hải Phòng","4.3","1.2km",R.drawable.htqt));
        mangTraSua3.add(new TraSua("Bánh Tráng Kẹp Dì Hoa","62/2A Núi Thành","4.3","1.2km",R.drawable.btkdh));
        mangTraSua3.add(new TraSua("Bánh Waffle - Bánh Nướng Tổ Ong","174 Phan Châu Trinh","4.3","1.2km",R.drawable.bw));
        mangTraSua3.add(new TraSua("Bánh Mì & Bánh Cuốn Liên","34 Nguyễn Thị Minh Khai","4.3","1.2km",R.drawable.bm));
        mangTraSua3.add(new TraSua("Tiệm Bánh Mr.C","74 Thái Phiên","4.3","1.2km",R.drawable.tb));
        mangTraSua3.add(new TraSua("Bánh Canh Cá Nướng","Lê Văn Duyệt, P. Nại Hiên Đông","4.3","1.2km",R.drawable.bccn));
        mangTraSua3.add(new TraSua("Bánh Tráng Trộn Dì Hằng","2 Hải Phòng","4.3","1.2km",R.drawable.bttdh));

        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Banh.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Banh.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Banh.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Banh.this ,R.layout.dong_food_custom,mangTraSua3
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
