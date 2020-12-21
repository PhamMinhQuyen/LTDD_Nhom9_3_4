package com.example.appdatthucan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class list_food extends AppCompatActivity {
    Button h;
    Button pr;
    Button tbao;
    ListView lvMonAn,lvMonAn1,lvMonAn2 ;
    ArrayList<DonHang> mangDonhang,mangMonAnLS, mangMonAnDN;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_food);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.order);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.order:

                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                , Tbao.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.myaccount:
                        startActivity(new Intent(getApplicationContext()
                                ,ProfileUser.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


        lvMonAn=(ListView) findViewById(R.id.ListviewMonAn);
        lvMonAn1=(ListView)findViewById(R.id.ListviewMonAn1);
        lvMonAn2= (ListView)findViewById(R.id.ListviewMonAn2);


        mangDonhang= new ArrayList<DonHang>();
        mangMonAnLS= new ArrayList<DonHang>();
        mangMonAnDN = new ArrayList<DonHang>();



        //thêm món ăn vào mảng Món Ăn Lịch sử
        mangMonAnLS.add(new DonHang("Pizza - Bingsu 4H Takeaway","22.000 VNĐ",R.drawable.pizza,"64 Nguyễn Du-Đà Nẵng"));
        mangMonAnLS.add(new DonHang("Gà Rán KFC ","22.000 VNĐ",R.drawable.gakfc,"212 Nguyễn Văn Linh-Đà Nẵng"));
        mangMonAnLS.add(new DonHang("Gà Rán KFC ","22.000 VNĐ",R.drawable.gakfc,"212 Nguyễn Văn Linh-Đà Nẵng"));


        //thêm món ăn vào mảng Món Ăn đơn nháp
        mangMonAnDN.add(new DonHang("Pizza - Bingsu 4H Takeaway","22.000 VNĐ",R.drawable.pizza,"64 Nguyễn Du-Đà Nẵng"));
        mangMonAnDN.add(new DonHang("Gà Rán KFC ","22.000 VNĐ",R.drawable.gakfc,"212 Nguyễn Văn Linh-Đà Nẵng"));
        mangMonAnDN.add(new DonHang("Xôi Chè ","22.000 VNĐ",R.drawable.xoiche,"33 Nguyễn Chí Thanh- Đà Nẵng"));



        final DonHangAdapter DonHangAdapter = new DonHangAdapter(
                list_food.this,
                R.layout.activity_dong_mon_an,
                mangDonhang
        );
        final DonHangAdapter DonHangAdapter2 = new DonHangAdapter(
                list_food.this,
                R.layout.activity_dong_mon_an,
                mangMonAnLS
        );
        final DonHangAdapter DonHangAdapter3 = new DonHangAdapter(
                list_food.this,
                R.layout.activity_dong_mon_an,
                mangMonAnDN
        );

        lvMonAn.setAdapter(DonHangAdapter);
        lvMonAn1.setAdapter(DonHangAdapter2);
        lvMonAn2.setAdapter(DonHangAdapter3);



//XÓA CHO TAB ĐANG TỚI

        lvMonAn.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(list_food.this);
                dialog.setCancelable(true);
                dialog.setTitle("Bạn có chắc chắn muốn xóa không?");
                dialog.setMessage("Đơn hàng nếu xóa sẽ không khôi phục lại được" );
                dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //code cho button có.
                        mangDonhang.remove(position);
                        DonHangAdapter.notifyDataSetChanged();
                    }
                })
                        .setNegativeButton("Không ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //code cho button ko
                            }
                        });

                final AlertDialog alert = dialog.create();
                alert.show();

                return false;
            }
        });

        // XÓA CHO TAB LỊCH SỬ
        lvMonAn1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(list_food.this);
                dialog.setCancelable(true);
                dialog.setTitle("Bạn có chắc chắn muốn xóa không?");
                dialog.setMessage("Đơn hàng nếu xóa sẽ không khôi phục lại được" );
                dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //code cho button có.
                        mangMonAnLS.remove(position);
                        DonHangAdapter2.notifyDataSetChanged();
                    }
                })
                        .setNegativeButton("Không ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //code cho button ko
                            }
                        });

                final AlertDialog alert = dialog.create();
                alert.show();

                return false;
            }
        });
// XÓA CHO TAB ĐƠN NHÁP
        lvMonAn2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(list_food.this);
                dialog.setCancelable(true);
                dialog.setTitle("Bạn có chắc chắn muốn xóa không?");
                dialog.setMessage("Đơn hàng nếu xóa sẽ không khôi phục lại được" );
                dialog.setPositiveButton("Có", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        //code cho button có.
                        mangMonAnDN.remove(position);
                        DonHangAdapter3.notifyDataSetChanged();
                    }
                })
                        .setNegativeButton("Không ", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //code cho button ko
                            }
                        });

                final AlertDialog alert = dialog.create();
                alert.show();

                return false;
            }
        });
        //
        //bắt đầu tabhost
        TabHost tabhost = (TabHost) findViewById(R.id.tabhost);

        // setting up the tab host
        tabhost.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("Đang Đến");
        spec.setContent(R.id.tab1);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("Đang Đến");

        //thêm  tab vào tabhost
        tabhost.addTab(spec);

        // Code thêm Tab 2 vào tabhost
        spec = tabhost.newTabSpec("Lịch Sử");
        spec.setContent(R.id.tab2);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Lịch Sử");
        tabhost.addTab(spec);

        // Code thêm Tab 3 vào  tabhost
        spec = tabhost.newTabSpec("Đơn Nháp");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Đơn Nháp");
        tabhost.addTab(spec);
///////////////////////////////////

    }
}