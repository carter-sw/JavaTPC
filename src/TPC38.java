import kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {

        List<BookDTO> list = new ArrayList<BookDTO>(1);  //<BookDTO> 나는 BookDTO타입만 사용한다.

        list.add(new BookDTO("자바",12000,"이지스",600));
        list.add(new BookDTO("C언어",12000,"이지스",600));
        list.add(new BookDTO("Python",12000,"이지스",600));

        for(int i=0; i<list.size(); i++){
            BookDTO vo = list.get(i);
            System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
        }
    }
}
