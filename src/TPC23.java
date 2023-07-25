import kr.tpc.Animail;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC23 {
    public static void main(String[] args) {
        // 1. 다형성인수
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);

    }   //upcasting

    private static void display(Animail e) { // 다형성인수
        e.eat();
        if (e instanceof Cat) {
            ((Cat) e).night(); //downcasting
        }
    }
}
