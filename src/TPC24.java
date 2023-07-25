import kr.tpc.Animail;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC24 {
    public static void main(String[] args) {
        // 2.다형성 배열
        // Dog , Cat 저장할 배열을생성하시오?

        Animail[] ani = new Animail[2];
        ani[0] = new Dog();
        ani[1] = new Cat();

        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();
            }
        }
        display(ani);
    }

    private static void display(Animail[] ani) {
        for (int i = 0; i < ani.length; i++) {
            ani[i].eat();
            if (ani[i] instanceof Cat) {
                ((Cat) ani[i]).night();
            }
        }
    }
}
