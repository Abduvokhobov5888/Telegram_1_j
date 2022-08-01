package com.example.telegram_1_j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getAllChats();
    }
    void getAllChats(){
        ArrayList<Chat> chats = new ArrayList<>();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new GridLayoutManager(this,1));

        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));
        chats.add(new Chat(R.drawable.foto1,"Abbosbek Abduvoxobov","last seen recently"));
        chats.add(new Chat(R.drawable.foto2,"Muslim Abdurashidov","last seen recently"));
        chats.add(new Chat(R.drawable.foto3,"Abdulhakim Omonboyev","last seen recently"));

        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }
}