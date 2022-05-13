package com.example.a522java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recyclerview_id);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

            ArrayList<Chats> list = new ArrayList<>();
            list.add(new Chats(R.drawable.rasm, "Alisher Daminov", "5"));
            list.add(new Chats(R.drawable.rasm1, "Alifdefsher Daminov", "5"));
            list.add(new Chats(R.drawable.rasm2, "kdjkj Daminov", "85"));
            list.add(new Chats(R.drawable.rasm3, "Alisher Daminov", "5"));
            list.add(new Chats(R.drawable.rasm4, "Alishdfdfer Daminov", "0"));
            list.add(new Chats(R.drawable.rasm5, "Alisher ffff", "5887"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm6, "ss vvv", "2"));
            list.add(new Chats(R.drawable.rasm7, "xaasdx Daminovcc", "124"));

            ChatAdapter adapter = new ChatAdapter(list, this);
            recyclerView.setAdapter(adapter);
        }
    }
