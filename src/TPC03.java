import kr.bit.Book;
import kr.bit.Person;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라
        // 정수 1개를 저장하기 위한 변수를 선언하시오.
        int a;
        a=10;

        //책 1권을 저장하기위한 변수를 선언하시오.
        Book b;

        b = new Book();
        b.title = "자바";
        b.price = 16000;
        b.company="한빛미디어";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.company);
        System.out.println(b.page);
        System.out.println(b.price);

        Person p;
        p= new Person();
        p.name = "김시원";
        p.age=28;
        p.weight=68.4f;
        p.height=175.f;

    }
}
