package com.example.appdatthucan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileUser extends AppCompatActivity {

    Button bt_main,dx,tb,dh,btquetqr, btquanganday,venow,tttg,caidat,guimail,shopx;
    TextView mprofile_name;
    ImageView avt;

    FirebaseAuth firebaseAuth;
    FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_user);


        venow=(Button)findViewById(R.id.bt_venow);
        venow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vn= new Intent(ProfileUser.this,VeNow.class);
                startActivity(vn);
            }
        });
        shopx=(Button)findViewById(R.id.shopxu);
        shopx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vn= new Intent(ProfileUser.this,List_Xu.class);
                startActivity(vn);
            }
        });
        tttg=(Button)findViewById(R.id.bt_tttg);
        tttg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tt=new Intent(ProfileUser.this,Trung_tam_tro_giup.class);
                startActivity(tt);
            }
        });
        caidat=(Button)findViewById(R.id.bt_caidat);
        caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cd = new Intent(ProfileUser.this,Cai_Dat.class);
                startActivity(cd);
            }
        });
        guimail=(Button)findViewById(R.id.bt_guimail);
        guimail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gm= new Intent(ProfileUser.this,GuiMail.class);
                startActivity(gm);
            }
        });

        btquetqr=(Button)findViewById(R.id.bt_quetma);
        btquetqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(ProfileUser.this, ScannedBarcodeActivity.class);
                startActivity(intent);
            }
        });

      btquanganday= (Button)findViewById(R.id.bt_ganday);
      btquanganday.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent map = new Intent(ProfileUser.this, MapsActivity.class);
              startActivity(map);
          }
      });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.myaccount);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.myaccount:
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
                    case R.id.notification:
                        startActivity(new Intent(getApplicationContext()
                                , Tbao.class));
                        overridePendingTransition(0,0);
                        return true;

                }
                return false;
            }
        });

        dx=findViewById(R.id.dangxuat);
        firebaseAuth = FirebaseAuth.getInstance();
        mprofile_name = findViewById(R.id.profile_name);

        dx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseAuth.signOut();
                Intent intent=new Intent(ProfileUser.this,MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }
    private void checkuser(){
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if(user!=null){
            mprofile_name.setText(user.getEmail());
        }
        else {
            startActivity(new Intent(ProfileUser.this,Login.class));
            finish();
        }
    }
    @Override
    protected void onStart(){
        checkuser();
        super.onStart();

    }


}
