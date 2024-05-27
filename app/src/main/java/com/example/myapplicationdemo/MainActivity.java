package com.example.myapplicationdemo;

import static com.example.myapplicationdemo.R.*;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapterClass myAdapterClass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ArrayList<Item>list = getArrayList();
         recyclerView=findViewById(R.id.recyclerview);
        myAdapterClass = new MyAdapterClass(this,list);
        recyclerView.setAdapter(myAdapterClass);


    }

    private ArrayList<Item> getArrayList() {
        ArrayList<Item> list = new ArrayList<>();
        Item item = new Item("Mark","mark@gmail.com", drawable.mark);
        Item item2 = new Item("Bill Gate","billgate@gmail.com", drawable.bill);
        Item item3 = new Item("Elon Mask","elonmask@gmail.com", drawable.elom);
        Item item4 = new Item("Ratan Tata","ratantata@gmail.com", drawable.ratan);
        Item item5 = new Item("Mark","mark@gmail.com", drawable.mark);
        Item item6 = new Item("Bill Gate","billgate@gmail.com", drawable.bill);
        Item item7 = new Item("Elon Mask","elonmask@gmail.com", drawable.elom);
        Item item8 = new Item("Ratan Tata","ratantata@gmail.com", drawable.ratan);



        list.add(item);
        list.add(item2);
        list.add(item3);
        list.add(item4);
        list.add(item5);
        list.add(item6);
        list.add(item7);
        list.add(item8);
        return list;
    }


}