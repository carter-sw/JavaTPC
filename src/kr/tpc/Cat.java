package kr.tpc;

public class Cat extends Animail{

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹다");
    }

    public void night(){
        System.out.println("밤에 눈에서 빛이난다.");
    }
}
