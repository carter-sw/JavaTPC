import kr.poly.*;


public class TPC25 {
    public static void main(String[] args) {
        // eat ()   -- 재정의 (override) --> eat()
        Animail ani = new Dog();
        ani.eat(); //eat (?) -> eat개
        ani.move();

        ani=new Cat();
        ani.eat(); //eat (?) -> eat 고양이
        ((Cat)ani).night();
    }
}
