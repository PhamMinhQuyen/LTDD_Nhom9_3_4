package com.example.appdatthucan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class kmai extends AppCompatActivity {
    Button bt_tl_tbao;

    ListView listProduct;
    Context context;
    ArrayList<product_khuyenmai> data;
    CustomerAdapter_KMai customerAdapter;
    product_khuyenmai model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        setContentView(R.layout.activity_khuyenmai);


        bt_tl_tbao=(Button) findViewById(R.id.bt_tl_tbao);
        bt_tl_tbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(kmai.this, Tbao.class);
                startActivity(intent);
            }
        });

        listProduct=(ListView) findViewById(R.id.listProduct);

        data=new ArrayList<>();
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"[NowFresh]Cuối tuần ẵm deal to GIẢM ĐẾN 50%","Đi chợ online chẳng mất sức,túi cũng không lo bị viêm với ưu đãi cực đã đến 50% cho cơm bao ngon","19/12/2020 08:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"Trà sữa Toco Toco 0Đ,một lòng chốt đơn","Nhập mã TOCO0D để được giảm 23k khi đặt món Trà sữa kim cương đen Okinawa và Trà Sữa trân châu hoàng kim Toco","18/12/2020 14:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"[NowFresh]Cuối tuần ẵm deal to GIẢM ĐẾN 50%","Đi chợ online chẳng mất sức,túi cũng không lo bị viêm với ưu đãi cực đã đến 50% cho cơm bao ngon","19/12/2020 08:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"Gu của anh là Châu Á","Gu của Now cũng vậy nha.Nhập mã AMTHUCCHAUA giảm ngay 50% tối đa 30K cho đơm từ 50k","18/12/2020 10:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"Em ơi trời đã vào đông,Now đang giảm giá lòng vòng chi xa","Hàng loạt deal hấp dẫn mùa noel đang chờ: Giảm sâu 50%,Freeship cho đơn từ 30k","18/12/2020 08:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"Quán xịn giảm 40%,tăm tỉa chọn món","Cánh trai hư thì hót bao điều,trái tim này hỏi rằng em đã săn deal chưa","17/12/2020 08:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"KFC giảm 40$ gặm gà thả ga","Đi chợ online chẳng mất sức,túi cũng không lo bị viêm với ưu đãi cực đã đến 50% cho gà bao ngon","16/12/2020 08:00"));
        data.add(new product_khuyenmai(R.drawable.tra_sua_caramel,"Năm nay có lẽ chẳng kịp đi Thái","Nhưng để ăn đồ Thái thì chẳng cần chờ đến mai.Nhập mã THAILAN giảm ngay 50% tối đa 30k","15/12/2020 08:00"));





        customerAdapter =new CustomerAdapter_KMai(this,R.layout.activity_product_kmai,data);
        listProduct.setAdapter(customerAdapter);

    }}
