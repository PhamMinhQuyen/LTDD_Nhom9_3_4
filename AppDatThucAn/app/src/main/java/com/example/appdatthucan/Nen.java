package com.example.appdatthucan;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Nen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int time = 3;
                do {
                    time--;

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                } while (time > 0);
                Intent sign_up = new Intent(Nen.this, MainActivity.class);
                startActivity(sign_up);
            }
        });
        thread.start();

    }
}