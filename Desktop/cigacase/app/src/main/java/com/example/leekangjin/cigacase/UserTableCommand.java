package com.example.leekangjin.cigacase;

/**
 * Created by miste on 2017-11-14.
 */

public class UserTableCommand {
    private static final String TABLE_NAME = "user";
    private static final String KEY_USERID = "userID";
    private static final String KEY_CHALLENGE_SMOKE_NUM = "challengeSmokeNum";
    private static final String USER_ID = "0";

    private static final String USER_TABLE_CREATE_COMMAND =
            "CREATE TABLE " + TABLE_NAME + " (" +
            KEY_USERID + " INT" + " PRIMARY KEY" + ", " +
            KEY_CHALLENGE_SMOKE_NUM + " INT" +
            ");";

    public String getUserTableCreateCommand() {
        return USER_TABLE_CREATE_COMMAND;
    }

    public String getUserTableSelectCommand() {
        String USER_TABLE_SELECT_COMMAND =
                "SELECT * FROM " + TABLE_NAME + ";";

        return USER_TABLE_SELECT_COMMAND;
    }

    public String getUserTableInsertCommand(int insertChallengeNum) {
        String USER_TABLE_INSERT_COMMAND =
                "INSERT INTO " + TABLE_NAME + " VALUES" + " (" +
                        USER_ID + "," + insertChallengeNum + ");";

        return USER_TABLE_INSERT_COMMAND;
    }

    public String getUserTableUpdateCommand(int updateChallengeNum) {
        String USER_TABLE_UPDATE_COMMAND =
                "UPDATE " + TABLE_NAME + " SET " +
                KEY_CHALLENGE_SMOKE_NUM  + "=" + updateChallengeNum +
                " WHERE " + KEY_USERID + "=" + USER_ID + ";";

        return USER_TABLE_UPDATE_COMMAND;
    }
}
