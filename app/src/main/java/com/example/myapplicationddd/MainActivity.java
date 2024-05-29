package com.example.myapplicationddd;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.SQLDataException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lv);;
        TextView txttest = findViewById(R.id.txttest);;


        ArrayList<SanPham> arrayList = new ArrayList<SanPham>();
        arrayList.add(new SanPham("bun", 20, 15000, R.drawable.bun));
        arrayList.add(new SanPham("bun1", 10, 35000, R.drawable.bun));
        arrayList.add(new SanPham("bun2", 5, 55000, R.drawable.bun));
        arrayList.add(new SanPham("bun3", 2, 85000, R.drawable.bun));
        arrayList.add(new SanPham("bun4", 1, 99000, R.drawable.bun));

        AdapterSanPham adapter = new AdapterSanPham(MainActivity.this, R.layout.sanpham, arrayList);

        try {
            lv.setAdapter(adapter);
        } catch (Exception ex) {
            txttest.setText("Lỗi: " + ex.getMessage());
        }
    }
}
