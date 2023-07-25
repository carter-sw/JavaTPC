import kr.tpc.Animail;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();

        //Dog.class , Cat.class
        Animail ani = new Dog(); //upcasting
        ani.eat();

        Animail animail = new Cat();
        animail.eat();
        ((Cat)animail).night();

    }
}
