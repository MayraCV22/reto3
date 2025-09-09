package com.example.r3cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReciclerAdapter extends RecyclerView.Adapter<ReciclerAdapter.ViewHolder>{
    private ArrayList<RecyclerList> recyclelist;
    private Context context;

    @NonNull
    @Override
    public ReciclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_reciclecard,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ReciclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return recyclelist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            txt = itemView.findViewById(R.id.textView2);
        }
    }
}
