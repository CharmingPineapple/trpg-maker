package com.example.trpg_maker_android.story.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class StoryBondDBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "StoryBondDB";
    public static final String STORY_BOND_TABLE = "StoryBondTable";
    public static final int DB_VERSION = 1;

    public static final String KEY_ID = "_id";
    public static final String KEY_ANC_ID = "ancestor_id";
    public static final String KEY_DESC_ID = "descendant_id";
    public static final String KEY_TITLE = "title";

    public StoryBondDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table " + STORY_BOND_TABLE + "(" + KEY_ID + " integer primary key," + KEY_ANC_ID + " integer,"
                + KEY_DESC_ID + " integer," + KEY_TITLE + " text" + ") ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("drop table if exists " + STORY_BOND_TABLE);

        onCreate(sqLiteDatabase);
    }
}
