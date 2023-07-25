import kr.tpc.OverLoad;

public class TPC16 {
    public static void main(String[] args) {
        //1+1=? 23.4 +56=? 56.7+78.9=?
        OverLoad ov = new OverLoad();
        ov.hap(4,5);
        ov.hap(23.4f,56);
        ov.hap(23.5f,24.12f);
    }
}
