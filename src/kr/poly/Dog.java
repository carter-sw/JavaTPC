package kr.poly;

public class Dog extends Animail {
    // 이름,나이,종 :상태정보
    // 재정의 (override)
    public void eat(){
        System.out.println("개처럼 먹다");
    }
    public Dog(){
        super();
    }



}
