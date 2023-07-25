import kr.tpc.MemberVO;

public class TPC15 {
    public static void main(String[] args) {
        MemberVO m = new MemberVO("홍길동",40,"01094594254","서울");

        System.out.println(m.toString());

        MemberVO m1 = new MemberVO();
        m.setName("sf");
        m.setAge(5  );
        m.setTel("af");
        m.setAddr("afwet");

        System.out.println(m1);

    }
}
