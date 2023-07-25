import kr.tpc.MyUtil;

import java.util.Locale;

public class TPC18 {
    public static void main(String[] args) {

        // 1. java 에서 제공해주는 class.. API
       // 문자열(String)
       String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        //2. 직접 만들어서 상용하는 class들 DTO/VO , DAO , Utility API
        MyUtil my = new MyUtil();
        int sum= my.hap();
        System.out.println(sum);

        //3. 다른회사
        // Gson
    }
}
