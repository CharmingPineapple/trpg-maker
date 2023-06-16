package com.example.trpg_maker_android.model.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BlockDBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "BlockDB";
    public static final String TABLE_NAME = "BlockTable";
    public static final int DB_VERSION = 1;

    public static final String KEY_ID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TEXT = "text";

    public BlockDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + TABLE_NAME + "(" + KEY_ID + " integer primary key," + KEY_NAME + " text,"
                + KEY_TITLE + " text," + KEY_TEXT + " text" + ") ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("drop table if exists " + TABLE_NAME);

        onCreate(sqLiteDatabase);
    }
}
