package com.example.myapplicationddd;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.SQLDataException;

public class DataBaseManager {
    private  DataHeapr dbHeapr;
    private Context context;
    private SQLiteDatabase database;
    public DataBaseManager(Context ctx){
        context = ctx;
    }

    public DataBaseManager open() throws SQLDataException{
        dbHeapr = new DataHeapr(context);
        database = dbHeapr.getWritableDatabase();
        return this;
    }
    public void close(){
        dbHeapr.close();
    }
    public void insert (String tenSP,String soluong,String gia,int hinhanh){
        ContentValues contentValues = new ContentValues();
        contentValues.put(DataHeapr.TEN_SP,tenSP);
        contentValues.put(DataHeapr.GIA_SP,gia);
        contentValues.put(DataHeapr.SO_LUONG,soluong);
        contentValues.put(DataHeapr.IMGSP,hinhanh);

        database.insert(DataHeapr.Data_table,null,contentValues);


    }
    public Cursor loadds(){
        String [] Columns = new String[] {DataHeapr.TEN_SP,DataHeapr.SO_LUONG,DataHeapr.GIA_SP,DataHeapr.IMGSP};
        Cursor cursor = database.query(dbHeapr.Data_table,Columns,null,null,null,null,null);
        if(cursor != null)
        {
            cursor.moveToFirst();
        }
        return cursor;
    }
    public int update (String tenSP,String soluong,String gia,String hinhanh)
    {
        ContentValues contentValues = new ContentValues();

        contentValues.put(DataHeapr.GIA_SP,gia);
        contentValues.put(DataHeapr.SO_LUONG,soluong);
        contentValues.put(DataHeapr.IMGSP,hinhanh);


        int ret = database.update(dbHeapr.Data_table,contentValues,DataHeapr.TEN_SP + "?"+  tenSP, new String[]{tenSP});
        return ret;
    }
    public void delete (String tenSP ,String soluong,String gia )
    {
        database.delete(dbHeapr.Data_table,DataHeapr.TEN_SP + "?"+ tenSP,new String[]{tenSP});
    }
}

