package com.example.fapplication.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.fapplication.R;

import java.util.ArrayList;

public class tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adaprer adaprer;
    ArrayList<T32Contact> ls=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32Lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Viet A", "20", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Tran Viet B", "18", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Thi C", "25", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Viet D", "40", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Viet E", "50", R.drawable.ic_launcher_background));
        ls.add(new T32Contact("Nguyen Viet F", "34", R.drawable.ic_launcher_background));
        //tao adaprer
        adaprer = new T32Adaprer(ls,this);
        lv.setAdapter(adaprer);

    }
}