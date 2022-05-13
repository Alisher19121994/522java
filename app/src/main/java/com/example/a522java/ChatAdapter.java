package com.example.a522java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    ArrayList<Chats> list;
    Context context;

    public ChatAdapter(ArrayList<Chats> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_adapter_recyclerview, parent, false);
        return new MyViews(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chats chats = list.get(position);
        if (holder instanceof MyViews){
            ShapeableImageView shapeableImageView1 = ((MyViews) holder).shapeableImageView;
            TextView textViewA  =((MyViews)holder).textView;
            TextView textViewB  =((MyViews)holder).textView1;
            shapeableImageView1.setImageResource(chats.profile);
            textViewA.setText(chats.fullname);
            textViewB.setText(chats.messagNumber);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViews extends RecyclerView.ViewHolder {
        ShapeableImageView shapeableImageView;
        TextView textView;
        TextView textView1;

        public MyViews(@NonNull View itemView) {
            super(itemView);
            shapeableImageView = itemView.findViewById(R.id.iv_image);
            textView = itemView.findViewById(R.id.fullname);
            textView1 = itemView.findViewById(R.id.tv_count);
        }
    }
}
