package com.example.leekangjin.cigacase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by miste on 2017-11-14.
 */

public class InternalDataBase extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "cigaCase.db";
    private static final int DATABASE_VERSION = 3;

    private UserTableCommand userTableCommand;
    private TodayCigaTableCommand todayCigaTableCommand;
    private MonthCigaTableCommand monthCigaTableCommand;

    InternalDataBase(Context context) {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

        userTableCommand = new UserTableCommand();
        todayCigaTableCommand = new TodayCigaTableCommand();
        monthCigaTableCommand = new MonthCigaTableCommand();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(userTableCommand.getUserTableCreateCommand());
        db.execSQL(todayCigaTableCommand.getTodayCigaTableCreateCommand());
        db.execSQL(monthCigaTableCommand.getMonthCigaTableCreateCommand());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
}
