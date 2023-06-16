package com.example.trpg_maker_android.model.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ActionDBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "ActionDB";
    public static final String TABLE_NAME = "ActionTable";
    public static final int DB_VERSION = 1;

    public static final String KEY_ID = "_id";
    public static final String KEY_ACT_SET_ID = "action_set_id";
    public static final String KEY_COND_ID = "cond_id";
    public static final String KEY_TYPE_ACT_ID = "type_act_id";
    public ActionDBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
