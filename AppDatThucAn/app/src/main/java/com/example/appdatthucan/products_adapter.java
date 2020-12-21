package com.example.appdatthucan;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class products_adapter extends FirebaseRecyclerAdapter<detailShop_Model,products_adapter.ViewHolder> {

    public products_adapter(@NonNull FirebaseRecyclerOptions<detailShop_Model> options2) {
        super(options2);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, final int position, @NonNull detailShop_Model model) {
        holder.named.setText(model.getnamefood());
        holder.priced.setText(model.getpricefood());
        holder.liked.setText(model.getlikefood());
        Glide.with(holder.imaged.getContext()).load(model.getimagefood()).into(holder.imaged);

        holder.bt_addcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent  = new Intent(view.getContext(),add_cart.class);
                intent.putExtra("namefood",getItem(position).getnamefood());
                intent.putExtra("imagefood",getItem(position).getimagefood());
                view.getContext().startActivity(intent);

            }
        });

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_layout,parent,false);
        return new ViewHolder(view);


    }

    class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imaged;
        TextView named;
        TextView priced;
        TextView liked;
        ImageButton bt_addcart;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imaged =itemView.findViewById(R.id.imgFood);
            named =itemView.findViewById(R.id.nameFood);
            priced =itemView.findViewById(R.id.priceFood);
            liked =itemView.findViewById(R.id.likeFood);
            bt_addcart = itemView.findViewById(R.id.btn_addcart);
        }
    }

}