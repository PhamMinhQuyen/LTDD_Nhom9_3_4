package com.example.appdatthucan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class shop_details extends AppCompatActivity {

    RecyclerView rcv;
    products_adapter adapter2;
    ImageView imgshop;
    ImageButton back;
    TextView nameshop, addshop,kmshop;
    RatingBar ratingBar;
    public String shopUid;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_details);

        back = findViewById(R.id.iconback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(shop_details.this,MainActivity.class);
                startActivity(i);
            }
        });

        //set dữ liệu cho trang sau click vào 1 item
        nameshop = findViewById(R.id.shopNameTv);
        addshop = findViewById(R.id.addressShopTv);
        imgshop =  findViewById(R.id.imgshopIv);
        kmshop = findViewById(R.id.kmShop);
        ratingBar = findViewById(R.id.rating);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        String receivedImage = intent.getStringExtra("image");
        String receivedAdd = intent.getStringExtra("address");
        Float receivedSao =  intent.getFloatExtra("sao",3);
        String receivedKm=  intent.getStringExtra("km");

        nameshop.setText(receivedName);
        ratingBar.setRating(receivedSao);
        kmshop.setText(receivedKm);
        addshop.setText(receivedAdd);
        Glide.with(this).load(receivedImage).into(imgshop);


        rcv=findViewById(R.id.recycleview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<detailShop_Model> options2 = new FirebaseRecyclerOptions.Builder<detailShop_Model>().setQuery(FirebaseDatabase.getInstance().getReference().child("products").child("ls1").child("products2"),detailShop_Model.class).build();

        adapter2 = new products_adapter(options2);

        rcv.setAdapter(adapter2);
    }

    @Override
    protected void onStart(){
        super.onStart();
        adapter2.startListening();
    }
    @Override
    protected void onStop(){
        super.onStop();
        adapter2.stopListening();
    }





}