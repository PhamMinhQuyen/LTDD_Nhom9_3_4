package com.example.appdatthucan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TinTuc extends AppCompatActivity {
    Button bt_tl_tbao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tintuc);

        bt_tl_tbao=(Button) findViewById(R.id.bt_tl_tbao);
        bt_tl_tbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TinTuc.this, Tbao.class);
                startActivity(intent);
            }
        });
    }
}
