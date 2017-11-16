package com.example.leekangjin.cigacase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by miste on 2017-11-14.
 */

public class TodayCigaTableCommand {
    private static final String TABLE_NAME = "todayCiga";
    private static final String KEY_USERID = "userID";
    private static final String KEY_DAY = "day";
    private static final String KEY_TODAY_SMOKE_NUM = "todaySmokeNum";
    private static final String USER_ID = "0";

    private static final String TODAYCIGA_TABLE_CREATE_COMMAND =
            "CREATE TABLE " + TABLE_NAME + " (" +
            KEY_USERID + " INT" + " REFERENCES " + "user" + "(" + KEY_USERID + ")" + ", " +
            KEY_DAY + " INT" + ", " +
            KEY_TODAY_SMOKE_NUM + " INT" + ", " +
            "PRIMARY KEY " + "(" + KEY_USERID + "," + KEY_DAY + ")" +
            ");";

    public String getTodayCigaTableCreateCommand() {
        return TODAYCIGA_TABLE_CREATE_COMMAND;
    }

    public String getTodayCigaTableSelectCommand() {
        String TODAY_CIGA_TABLE_SELECT_COMMAND =
                "SELECT * FROM " + TABLE_NAME + ";";

        return TODAY_CIGA_TABLE_SELECT_COMMAND;
    }

    public String getTodyaCigaTableInsertCommand(int insertTodaySmokeNum) {
        SimpleDateFormat today = new SimpleDateFormat("d");

        String TODAY_CIGA_TABLE_INSERT_COMMAND =
                "INSERT INTO " + TABLE_NAME + " VALUES" + " (" +
                USER_ID + "," + today.format(new Date()) + "," + insertTodaySmokeNum +
                ");";

        return TODAY_CIGA_TABLE_INSERT_COMMAND;
    }

    public String getTodayCigaTableUpdateCommand(int updateTodaySmokeNum) {
        SimpleDateFormat today = new SimpleDateFormat("d");

        String TODAY_CIGA_TABLE_UPDATE_COMMAND =
                "UPDATE " + TABLE_NAME + " SET " +
                KEY_TODAY_SMOKE_NUM  + "=" + updateTodaySmokeNum +
                " WHERE " + KEY_USERID + "=" + USER_ID +
                " AND " + KEY_DAY +"=" + today.format(new Date()) +
                ";";

        return TODAY_CIGA_TABLE_UPDATE_COMMAND;
    }
}
