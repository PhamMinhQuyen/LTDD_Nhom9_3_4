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

public class List_Com   extends AppCompatActivity {
    ArrayList<TraSua> mangTraSua,mangTraSua1,mangTraSua2,mangTraSua3;
    ListView lvTraSua, lvTraSua1,lvTraSua2, lvTraSua3;
    Button tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_com);

        tv= (Button) findViewById(R.id.trove);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Com.this, MainActivity.class);
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

        mangTraSua.add(new TraSua("Chân Gà Nướng Hai Còi","Ngô Thi Nhậm","4.7","1.2km",R.drawable.cgn));
        mangTraSua.add(new TraSua("Chân Gà Hồng Phát 2","12 Hoàng Hoa Thám","4.7","0.7km",R.drawable.cghp2));
        mangTraSua.add(new TraSua("Cơm Nài","Nguyễn Văn Linh","4.6","0.5km",R.drawable.cn));
        mangTraSua.add(new TraSua("Cơm Tấm Sinh Viên","Phạm Như Xương","4.3","1.2km",R.drawable.ctsv));
        mangTraSua.add(new TraSua("Mì Cay 7 Cấp Độ Hàn Quốc","Ngô Văn Sở","4.3","1.2km",R.drawable.mc));
        mangTraSua.add(new TraSua("Cơm Tấm Ngon","Ngô Văn Sở","4.3","1.2km",R.drawable.ctn));
        mangTraSua.add(new TraSua("Quán Cơm Sườn Nướng","Phạm Như Xương","4.3","1.2km",R.drawable.qcsn));
        mangTraSua.add(new TraSua("Cơm Chiên Long Phụng","Hà Văn Tính","4.3","1.2km",R.drawable.cclp));
        mangTraSua.add(new TraSua("Cơm Gà Bà Phượng","Ngô Thi Nhậm","4.3","1.2km",R.drawable.cgbp));
        mangTraSua.add(new TraSua("Mì Quảng Bích","Đặng Dung","4.3","1.2km",R.drawable.mqb));

        mangTraSua1.add(new TraSua("Chân Gà Nướng Hai Còi","Ngô Thi Nhậm","4.7","1.2km",R.drawable.cgn));
        mangTraSua1.add(new TraSua("Chân Gà Hồng Phát 2","12 Hoàng Hoa Thám","4.7","0.7km",R.drawable.cghp2));
        mangTraSua1.add(new TraSua("Cơm Nài","Nguyễn Văn Linh","4.6","0.5km",R.drawable.cn));
        mangTraSua1.add(new TraSua("Cơm Tấm Sinh Viên","Phạm Như Xương","4.3","1.2km",R.drawable.ctsv));
        mangTraSua1.add(new TraSua("Mì Cay 7 Cấp Độ Hàn Quốc","Ngô Văn Sở","4.3","1.2km",R.drawable.mc));
        mangTraSua1.add(new TraSua("Cơm Tấm Ngon","Ngô Văn Sở","4.3","1.2km",R.drawable.ctn));
        mangTraSua1.add(new TraSua("Quán Cơm Sườn Nướng","Phạm Như Xương","4.3","1.2km",R.drawable.qcsn));
        mangTraSua1.add(new TraSua("Cơm Chiên Long Phụng","Hà Văn Tính","4.3","1.2km",R.drawable.cclp));
        mangTraSua1.add(new TraSua("Cơm Gà Bà Phượng","Ngô Thi Nhậm","4.3","1.2km",R.drawable.cgbp));
        mangTraSua1.add(new TraSua("Mì Quảng Bích","Đặng Dung","4.3","1.2km",R.drawable.mqb));


        mangTraSua2.add(new TraSua("Chân Gà Nướng Hai Còi","Ngô Thi Nhậm","4.7","1.2km",R.drawable.cgn));
        mangTraSua2.add(new TraSua("Chân Gà Hồng Phát 2","12 Hoàng Hoa Thám","4.7","0.7km",R.drawable.cghp2));
        mangTraSua2.add(new TraSua("Cơm Nài","Nguyễn Văn Linh","4.6","0.5km",R.drawable.cn));
        mangTraSua2.add(new TraSua("Cơm Tấm Sinh Viên","Phạm Như Xương","4.3","1.2km",R.drawable.ctsv));
        mangTraSua2.add(new TraSua("Mì Cay 7 Cấp Độ Hàn Quốc","Ngô Văn Sở","4.3","1.2km",R.drawable.mc));
        mangTraSua2.add(new TraSua("Cơm Tấm Ngon","Ngô Văn Sở","4.3","1.2km",R.drawable.ctn));
        mangTraSua2.add(new TraSua("Quán Cơm Sườn Nướng","Phạm Như Xương","4.3","1.2km",R.drawable.qcsn));
        mangTraSua2.add(new TraSua("Cơm Chiên Long Phụng","Hà Văn Tính","4.3","1.2km",R.drawable.cclp));
        mangTraSua2.add(new TraSua("Cơm Gà Bà Phượng","Ngô Thi Nhậm","4.3","1.2km",R.drawable.cgbp));
        mangTraSua2.add(new TraSua("Mì Quảng Bích","Đặng Dung","4.3","1.2km",R.drawable.mqb));

        mangTraSua3.add(new TraSua("Chân Gà Nướng Hai Còi","Ngô Thi Nhậm","4.7","1.2km",R.drawable.cgn));
        mangTraSua3.add(new TraSua("Chân Gà Hồng Phát 2","12 Hoàng Hoa Thám","4.7","0.7km",R.drawable.cghp2));
        mangTraSua3.add(new TraSua("Cơm Nài","Nguyễn Văn Linh","4.6","0.5km",R.drawable.cn));
        mangTraSua3.add(new TraSua("Cơm Tấm Sinh Viên","Phạm Như Xương","4.3","1.2km",R.drawable.ctsv));
        mangTraSua3.add(new TraSua("Mì Cay 7 Cấp Độ Hàn Quốc","Ngô Văn Sở","4.3","1.2km",R.drawable.mc));
        mangTraSua3.add(new TraSua("Cơm Tấm Ngon","Ngô Văn Sở","4.3","1.2km",R.drawable.ctn));
        mangTraSua3.add(new TraSua("Quán Cơm Sườn Nướng","Phạm Như Xương","4.3","1.2km",R.drawable.qcsn));
        mangTraSua3.add(new TraSua("Cơm Chiên Long Phụng","Hà Văn Tính","4.3","1.2km",R.drawable.cclp));
        mangTraSua3.add(new TraSua("Cơm Gà Bà Phượng","Ngô Thi Nhậm","4.3","1.2km",R.drawable.cgbp));
        mangTraSua3.add(new TraSua("Mì Quảng Bích","Đặng Dung","4.3","1.2km",R.drawable.mqb));


        TraSuaAdapter suaAdapter = new TraSuaAdapter(
                List_Com.this ,R.layout.dong_food_custom,mangTraSua
        );
        lvTraSua.setAdapter(suaAdapter);
        TraSuaAdapter suaAdapter1 = new TraSuaAdapter(
                List_Com.this ,R.layout.dong_food_custom,mangTraSua1
        );
        lvTraSua1.setAdapter(suaAdapter1);
        TraSuaAdapter suaAdapter2 = new TraSuaAdapter(
                List_Com.this ,R.layout.dong_food_custom,mangTraSua2
        );
        lvTraSua2.setAdapter(suaAdapter2);
        TraSuaAdapter suaAdapter3 = new TraSuaAdapter(
                List_Com.this ,R.layout.dong_food_custom,mangTraSua3
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
