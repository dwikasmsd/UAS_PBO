package model;

import java.util.UUID;

public class game_session
{
    private int gameSessionID;
    private int status;
    private int score;
    private int userID;
    private int levelID;
    private int tingkatKesulitanID;

    public game_session(int status, int score, int userID, int levelID, int tingkatKesulitanID)
    {
        this.status = status;
        this.score = score;
        this.userID = userID;
        this.levelID = levelID;
        this.tingkatKesulitanID = tingkatKesulitanID;
    }

    public int getGameSessionID() {
        return gameSessionID;
    }

    public void setGameSessionID(int gameSessionID) {
        this.gameSessionID = gameSessionID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    public int getTingkatKesulitanID() {
        return tingkatKesulitanID;
    }

    public void setTingkatKesulitanID(int tingkatKesulitanID) {
        this.tingkatKesulitanID = tingkatKesulitanID;
    }
}
