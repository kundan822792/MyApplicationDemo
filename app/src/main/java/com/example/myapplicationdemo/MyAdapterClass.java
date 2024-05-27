package com.example.myapplicationdemo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationdemo.R;

import java.util.ArrayList;

public class MyAdapterClass extends RecyclerView.Adapter<MyAdapterClass.MyViewHolder> {

    private Context context;
    private ArrayList<Item> items;

    public MyAdapterClass(Context context, ArrayList<Item> item) {
        this.context = context;
        this. items= item;
    }

    public void Item(Context context, ArrayList<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);

        MyAdapterClass.MyViewHolder viewHolder = new MyAdapterClass.MyViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = items.get(position);
        holder.name.setText(item.getName());
        holder.email.setText(item.getEmail());
        holder.image.setImageResource(item.getImage());



    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView name;
        private TextView email;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.imgelon);
            name=itemView.findViewById(R.id.txtelon);
            email=itemView.findViewById(R.id.emailelon);
        }
    }
}
