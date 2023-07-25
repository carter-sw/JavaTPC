import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        // int , float, char ,boolean -> PDT
        int a = 10;

        //책이라는 자료형을 만들자 -> class
        // 객체 생성
        BookDTO b = new BookDTO();

        b.company = "스프레이시스템";
        b.title = "kjjj";
        b.page = 10;
        b.price = 20000;
        System.out.println(b.company);

    }
}
