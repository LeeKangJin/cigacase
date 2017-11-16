package com.example.leekangjin.cigacase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by miste on 2017-11-16.
 */

public class UseSQLCommand {
    private InternalDataBase db;
    private UserTableCommand userTableCommand;
    private TodayCigaTableCommand todayCigaTableCommand;
    private MonthCigaTableCommand monthCigaTableCommand;

    UseSQLCommand(Context context) {
        db = new InternalDataBase(context);
        userTableCommand = new UserTableCommand();
        todayCigaTableCommand = new TodayCigaTableCommand();
        monthCigaTableCommand = new MonthCigaTableCommand();
    }

    public Cursor selectUserTable() {
        SQLiteDatabase user = db.getReadableDatabase();
        Cursor result = user.rawQuery(userTableCommand.getUserTableSelectCommand(),null);

        return result;
    }

    public void insertUserTable(int insertChallengeNum) {
        SQLiteDatabase user = db.getWritableDatabase();
        user.execSQL(userTableCommand.getUserTableInsertCommand(insertChallengeNum));
    }

    public void updateUserTable(int updateChallengNum) {
        SQLiteDatabase user = db.getWritableDatabase();
        user.execSQL(userTableCommand.getUserTableUpdateCommand(updateChallengNum));
    }

    public Cursor selectTodayCigaTable() {
        SQLiteDatabase todayCiga = db.getReadableDatabase();
        Cursor result = todayCiga.rawQuery(todayCigaTableCommand.getTodayCigaTableSelectCommand(),null);

        return result;
    }

    public void insertTodayCigaTable(int insertTodayCigaNum) {
        SQLiteDatabase todayCiga = db.getWritableDatabase();
        todayCiga.execSQL(todayCigaTableCommand.getTodyaCigaTableInsertCommand(insertTodayCigaNum));
    }

    public void updateTodayCigaTable(int updateTodayCigaNum) {
        SQLiteDatabase todayCiga = db.getWritableDatabase();
        todayCiga.execSQL(todayCigaTableCommand.getTodayCigaTableUpdateCommand(updateTodayCigaNum));
    }

    public Cursor selectMonthCigaTable() {
        SQLiteDatabase monthCiga = db.getReadableDatabase();
        Cursor result = monthCiga.rawQuery(monthCigaTableCommand.getMonthCigaTableSelectCommand(),null);

        return result;
    }

    public void insertMonthCigaTable(int insertMonthCigaNum) {
        SQLiteDatabase monthCiga = db.getWritableDatabase();
        monthCiga.execSQL(monthCigaTableCommand.getMonthCigaTableInsertCommand(insertMonthCigaNum));
    }

    public void updateMonthCigaTable(int updateMonthCigaNum) {
        SQLiteDatabase monthCiga = db.getWritableDatabase();
        monthCiga.execSQL(monthCigaTableCommand.getMonthCigaTableUpdateCommand(updateMonthCigaNum));
    }
}
