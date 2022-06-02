package com.example.projectfinal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DataBaseHelper extends SQLiteOpenHelper{
    public static final String SCORE_TABLE = "Score";
    public static final String SCORE_TABLE_ID = "ID";
    public static final String SCORE_TABLE_NAME = "Name";
    public static final String SCORE_TABLE_SCORE = "Score";

    boolean Write = false;


    public DataBaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String createTable = "CREATE TABLE " + SCORE_TABLE + "(" + SCORE_TABLE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + SCORE_TABLE_NAME + " VARCHAR(15), " + SCORE_TABLE_SCORE + " INTEGER " +")";
        sqLiteDatabase.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addNewScore(String name, int score){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(SCORE_TABLE_NAME, name);
        cv.put(SCORE_TABLE_SCORE, score);

        long insert = db.insert(SCORE_TABLE, null, cv);
        if(insert < 0){Write = false;}
        else{Write = true;}

        return Write;
    }

}
