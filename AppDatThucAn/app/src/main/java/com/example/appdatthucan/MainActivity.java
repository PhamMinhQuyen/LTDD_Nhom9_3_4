package com.example.appdatthucan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdatthucan.TraSua.List_Banh;
import com.example.appdatthucan.TraSua.List_Bia;
import com.example.appdatthucan.TraSua.List_Com;
import com.example.appdatthucan.TraSua.List_Ga_Ran;
import com.example.appdatthucan.TraSua.List_Thuoc;
import com.example.appdatthucan.TraSua.List_Tra_Sua;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyView;
    MonAnAdapter adapter;
    ViewFlipper viewFlipper;
    LinearLayout trasua,com,garan,banh,thuoc,bia;
    Button tsua, btcom, gran,btthuoc,btbia,btbanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tsua=(Button)findViewById(R.id.ts);
        tsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Tra_Sua.class));
            }
        });
        btcom=(Button)findViewById(R.id.com1);
        btcom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Com.class));
            }
        });
        gran=(Button)findViewById(R.id.ga);
        gran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Ga_Ran.class));
            }
        });

        trasua=(LinearLayout)findViewById(R.id.trasua);
        trasua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Tra_Sua.class));
            }
        });

        com=(LinearLayout)findViewById(R.id.com);
        com.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Com.class));
            }
        });

        garan=(LinearLayout)findViewById(R.id.garan);
        garan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Ga_Ran.class));
            }
        });

        banh=(LinearLayout)findViewById(R.id.banh);
        banh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Banh.class));
            }
        });
        btbanh=(Button)findViewById(R.id.bt_banh);
        btbanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Banh.class));
            }
        });
        btthuoc=(Button)findViewById(R.id.bt_thuoc);
        btthuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Thuoc.class));
            }
        });
        btbia=(Button)findViewById(R.id.bt_bia);
        btbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Bia.class));
            }
        });

        thuoc=(LinearLayout)findViewById(R.id.thuoc);
        thuoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Thuoc.class));
            }
        });

        bia=(LinearLayout)findViewById(R.id.bia);
        bia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, List_Bia.class));
            }
        });
// banner
        viewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper_main);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
// footer
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.order:
                        startActivity(new Intent(getApplicationContext()
                                ,list_food.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:

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


        recyView=findViewById(R.id.recyclev);
        recyView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerOptions<MonAn> options = new FirebaseRecyclerOptions.Builder<MonAn>().setQuery(FirebaseDatabase.getInstance().getReference().child("products"),MonAn.class).build();

        adapter = new MonAnAdapter(options);
        recyView.setAdapter(adapter);
    }
    @Override
    protected void onStart(){
        super.onStart();
        adapter.startListening();
    }
    @Override
    protected void onStop(){
        super.onStop();
        adapter.stopListening();
    }
}












