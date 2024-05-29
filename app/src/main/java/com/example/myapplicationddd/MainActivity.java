package com.example.myapplicationddd;

import android.os.Bundle;
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

    ListView lv;
    TextView txttest;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txttest = findViewById(R.id.txttest);
        ListView list ;
        ArrayList<SanPham> arrayList;
        AdapterSanPham adapterSanPham;

        list = findViewById(R.id.lv);
        arrayList = new ArrayList<>();
        arrayList.add(new SanPham("bun",20,15000,R.drawable.bun));
         try{
             adapterSanPham = new AdapterSanPham(MainActivity.this,R.layout.sanpham,arrayList);
             list.setAdapter(adapterSanPham);
         }
         catch ( Exception ex)
         {
             txttest.setText("loi " + ex);
        }


   }


}