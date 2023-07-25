import kr.tpc.MemberVO;

import java.lang.reflect.Member;

public class TPC14 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO();
        m.setName("홍길동");
        m.setAge(50);
        m.setTel("010-1111-1111");
        m.setAddr(" 서울");

        System.out.print(m.getName()+"\t");
        System.out.print(m.getAge()+"\t");
        System.out.print(m.getTel()+"\t");
        System.out.println(m.getAddr());

        System.out.println(m.toString());
    }
}
