package model;

public class tingkat_kesulitan
{
    private int tingkatKesulitanID;
    private String tingkatKesulitan;

    public tingkat_kesulitan(int tingkatKesulitanID, String tingkatKesulitan)
    {
        this.tingkatKesulitanID = tingkatKesulitanID;
        this.tingkatKesulitan = tingkatKesulitan;
    }

    public int getTingkatKesulitanID() {
        return tingkatKesulitanID;
    }

    public void setTingkatKesulitanID(int tingkatKesulitanID) {
        this.tingkatKesulitanID = tingkatKesulitanID;
    }

    public String getTingkatKesulitan() {
        return tingkatKesulitan;
    }

    public void setTingkatKesulitan(String tingkatKesulitan) {
        this.tingkatKesulitan = tingkatKesulitan;
    }
}
