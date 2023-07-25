import kr.tpc.BookVO;

public class TPC11 {
    public static void main(String[] args) {
        //책 1권을 저장하기 위해 객체를 생성하시오

        BookVO b = new BookVO();
        b.title="파이썬";
        b.price=100;

        System.out.println(b.title+"\t");
        System.out.println(b.price);
    }
}
