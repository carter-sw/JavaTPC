package kr.tpc;

public class JavaMySQL implements Dbconnect{
    @Override
    public void getConnection(String url, String user, String password) {
        System.out.println("MYSQL DB가 접속이 됩니다.");
    }
}
