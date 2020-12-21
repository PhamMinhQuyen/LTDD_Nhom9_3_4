package com.example.appdatthucan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class add_cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cart);

        ImageButton close = (ImageButton)findViewById(R.id.imgclose);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        ImageButton cart = (ImageButton)findViewById(R.id.cart_added);
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"Đã thêm vào giỏ hàng",Toast.LENGTH_LONG).show();
            }
        });

        ImageView imgBT =  (ImageView)findViewById(R.id.img_cart);
        ElegantNumberButton txt_count = (ElegantNumberButton)findViewById(R.id.txt_count);
        TextView txt_product_dialog = (TextView)findViewById(R.id.name_cart);
        EditText edt_comment = (EditText)findViewById(R.id.edt_comment);
        RadioButton rdo_btonM = (RadioButton)findViewById(R.id.rdo_sizeM);
        RadioButton rdo_btonL = (RadioButton)findViewById(R.id.rdo_sizeL);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("namefood");
        String receivedImage = intent.getStringExtra("imagefood");

        txt_product_dialog.setText(receivedName);
        Glide.with(this).load(receivedImage).into(imgBT);
    }
}