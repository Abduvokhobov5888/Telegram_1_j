package com.example.telegram_1_j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);
        return new MessageViewHolder(view);
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder{
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        TextView tv_message;
        public MessageViewHolder(@NonNull View itemview){
            super(itemview);

            iv_profile = itemview.findViewById(R.id.iv_profile);
            tv_fullname = itemview.findViewById(R.id.tv_fullname);
            tv_message = itemview.findViewById(R.id.tv_message);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat chat = items.get(position);

        if (holder instanceof MessageViewHolder){
            ShapeableImageView iv_profile = ((MessageViewHolder)holder).iv_profile;
            TextView tv_fullname = ((MessageViewHolder)holder).tv_fullname;
            TextView tv_message = ((MessageViewHolder)holder).tv_message;

            Glide.with(context).load(chat.profile).into(iv_profile);
            tv_fullname.setText(chat.fullname);
            tv_message.setText(chat.message);
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
