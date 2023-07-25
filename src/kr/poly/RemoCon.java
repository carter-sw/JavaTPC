package kr.poly;

public interface RemoCon { //객체생성 x; RemoCon r = new RemoCon();

    public final static int MAXCH=100;
    int MINCH=1; //public final static 생략되어있음 같은거거
   //추상 메서드
    public void chUp();
    public void chDown();
    public void internet();
}
