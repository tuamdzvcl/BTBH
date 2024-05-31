package com.example.myapplicationddd;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txttieude;
    Button btnisert;
    EditText edttensp,edtsl,edtgia;
    DataBaseManager dbManager;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnisert = findViewById(R.id.btninsert);
        ListView lv = findViewById(R.id.lv);
        edttensp = findViewById(R.id.edttensp);
        edtsl = findViewById(R.id.edtsl);
        edtgia = findViewById(R.id.edtgia);

        txttieude = findViewById(R.id.txttieude);
        dbManager = new DataBaseManager(this);

        ArrayList<SanPham> arrayList = new ArrayList<SanPham>();
        arrayList.add(new SanPham("bun", "20", "1500", R.drawable.bun));


        AdapterSanPham adapter = new AdapterSanPham(MainActivity.this, R.layout.sanpham, arrayList);

        try {
            lv.setAdapter(adapter);
        } catch (Exception ex) {
            txttieude.setText("Lỗi: " + ex.getMessage());
        }
    }

    public void btnisert(View view) {
        String tensp = edttensp.getText().toString();
        String sl = edtsl.getText().toString();
        String gia = edtgia.getText().toString();
        String msg = "";
        String tsp = new String(tensp);
        String sls = new String(sl);
        String g = new String(gia);
        dbManager.insert(tsp,sls,g,R.drawable.bun);
    }
}
