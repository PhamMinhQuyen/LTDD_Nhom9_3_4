package com.example.appdatthucan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Tbao extends AppCompatActivity {

    Button bt_profile;
    Button dh;
    Button main;
    Button kmai,ttuc;
    private ListView listProduct;
    Context context;
    ArrayList<product_tbao> data;
    CustomerAdapter_ThBao customerAdapter;
    product_tbao model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_tbao);


        kmai=(Button) findViewById(R.id.bt_km);
        kmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Tbao.this,kmai.class);
                startActivity(intent);
            }
        });
       ttuc=(Button)findViewById(R.id.bt_tintuc);
       ttuc.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent tt =new Intent(Tbao.this,TinTuc.class);
               startActivity(tt);
           }
       });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.notification);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.notification:

                        return true;
                    case R.id.order:
                        startActivity(new Intent(getApplicationContext()
                                ,list_food.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
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


        listProduct=findViewById(R.id.listProduct);
        registerForContextMenu(listProduct);
        data=new ArrayList<>();
        populateData();
        customerAdapter=new CustomerAdapter_ThBao(context,data);
        listProduct.setAdapter(customerAdapter);

    }
    private void populateData(){

        model=new product_tbao();
        model.setId(1);
        model.setTitle("Đã hoàn tất đơn");
        model.setChi_tiet("Đơn hàng của bạn tại R&B đã được Anh Nguyễn giao thành công.Cảm ơn bạn đã sử dụng dịch vụ của Now.");
        model.setTime("01/11/2020 19:33");
        model.setImage(R.drawable.rb);
        data.add(model);

        model=new product_tbao();
        model.setId(1);
        model.setTitle("Đã hoàn tất đơn");
        model.setChi_tiet("Đơn hàng của bạn tại Bún Đậu Nhà Cuội đã được Sơn Nguyễn giao thành công.Cảm ơn bạn đã sử dụng dịch vụ của Now.");
        model.setTime("03/10/2020 20:33");
        model.setImage(R.drawable.bdmt);
        data.add(model);

        model=new product_tbao();
        model.setId(1);
        model.setTitle("Đã hoàn tất đơn");
        model.setChi_tiet("Đơn hàng của bạn tại Chè Liên đã được Hoài Nam giao thành công.Cảm ơn bạn đã sử dụng dịch vụ của Now.");
        model.setTime("05/08/2020 09:00");
        model.setImage(R.drawable.che);
        data.add(model);

        model=new product_tbao();
        model.setId(1);
        model.setTitle("Đã hoàn tất đơn");
        model.setChi_tiet("Đơn hàng của bạn tại Tiger Sugar đã được Hoài Nam giao thành công.Cảm ơn bạn đã sử dụng dịch vụ của Now.");
        model.setTime("05/05/2020 08:00");
        model.setImage(R.drawable.che);
        data.add(model);

    }
}