package com.example.myapplicationddd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.sql.SQLDataException;

public class DataHeapr extends SQLiteOpenHelper {
    static final String DataBase_Name = "DataBase";
    static  final int version =1;

    static final String Data_table = "QLBH";
    static final String TEN_SP = "TenSP";
    static final String SO_LUONG ="SL" ;
    static final String GIA_SP = "GiaSP";
    static final String IMGSP = "HinhanhSP";


    private final String CREATE_DB_QUERY ="CREATE TABLE "
            +Data_table+"("
            + TEN_SP +"text primarykey"
            +SO_LUONG +"INTEGER"
            +GIA_SP +"INTEGER"
            +IMGSP+"text" +");";


    public DataHeapr( Context context) {
        super(context, DataBase_Name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_DB_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " +Data_table);
    }
}
