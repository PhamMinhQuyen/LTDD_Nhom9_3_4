package com.example.appdatthucan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MonAnAdapter extends FirebaseRecyclerAdapter<MonAn,MonAnAdapter.ViewHolder> {

    public MonAnAdapter(@NonNull FirebaseRecyclerOptions<MonAn> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, final int position, @NonNull final MonAn model) {
        holder.name.setText(model.getName());
        holder.address.setText(model.getAddress());
        holder.start.setRating(model.getStart());
        holder.km.setText(model.getKm());
        Glide.with(holder.img.getContext()).load(model.getImage()).into(holder.img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(),"You clicked",Toast.LENGTH_LONG).show();
                Intent intent  = new Intent(view.getContext(),shop_details.class);
                intent.putExtra("name",getItem(position).getName());
                intent.putExtra("image",getItem(position).getImage());
                intent.putExtra("sao",getItem(position).getStart());
                intent.putExtra("address",getItem(position).getAddress());
                intent.putExtra("km",getItem(position).getKm());
                view.getContext().startActivity(intent);

            }
        });
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_row,parent,false);
        return new ViewHolder(view);


    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView img;
        TextView name;
        TextView address;
        RatingBar start;
        TextView km;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img1);
            name=itemView.findViewById(R.id.nameText);
            address=itemView.findViewById(R.id.addressText);
            start=itemView.findViewById(R.id.ratingBar);
            km=itemView.findViewById(R.id.kmText);
        }
    }

}