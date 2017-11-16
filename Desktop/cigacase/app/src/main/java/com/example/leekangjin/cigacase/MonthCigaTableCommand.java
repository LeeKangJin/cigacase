package com.example.leekangjin.cigacase;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by miste on 2017-11-14.
 */

public class MonthCigaTableCommand {
    private static final String TABLE_NAME = "monthCiga";
    private static final String KEY_USERID = "userID";
    private static final String KEY_MONTH = "month";
    private static final String KEY_MONTH_SMOKE_NUM = "monthSmokeNum";
    private static final String USER_ID = "0";

    private static final String MONTHCIGA_TABLE_CREATE_COMMAND =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    KEY_USERID + " INT" + " REFERENCES " + "user" + "(" + KEY_USERID + ")" + ", " +
                    KEY_MONTH + " INT" + ", " +
                    KEY_MONTH_SMOKE_NUM + " INT" + ", " +
                    "PRIMARY KEY " + "(" + KEY_USERID + "," + KEY_MONTH + ")" +
                    ");";

    public String getMonthCigaTableCreateCommand() {
        return MONTHCIGA_TABLE_CREATE_COMMAND;
    }

    public String getMonthCigaTableSelectCommand() {
        String MONTH_CIGA_TABLE_SELECT_COMMAND =
                "SELECT * FROM " + TABLE_NAME + ";";

        return MONTH_CIGA_TABLE_SELECT_COMMAND;
    }

    public String getMonthCigaTableInsertCommand(int insertMonthSmokeNum) {
        SimpleDateFormat month = new SimpleDateFormat("M");

        String MONTH_CIGA_TABLE_INSERT_COMMAND =
                "INSERT INTO " + TABLE_NAME + " VALUES" + " (" +
                        USER_ID + "," + month.format(new Date()) + "," + insertMonthSmokeNum +
                        ");";

        return MONTH_CIGA_TABLE_INSERT_COMMAND;
    }

    public String getMonthCigaTableUpdateCommand(int updateMonthSmokeNum) {
        SimpleDateFormat month = new SimpleDateFormat("M");

        String MONTH_CIGA_TABLE_UPDATE_COMMAND =
                "UPDATE " + TABLE_NAME + " SET " +
                        KEY_MONTH_SMOKE_NUM  + "=" + updateMonthSmokeNum +
                        " WHERE " + KEY_USERID + "=" + USER_ID +
                        " AND " + KEY_MONTH +"=" + month.format(new Date()) +
                        ";";

        return MONTH_CIGA_TABLE_UPDATE_COMMAND;
    }
}
