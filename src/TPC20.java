import kr.tpc.Animail;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat(); //?

        Cat c = new Cat();
        c.eat();
        c.night();

        Animail d = new Dog();
        d.eat();

        Animail c2 = new Cat();
        c2.eat();
        ((Cat)c2).night();
    }
}
