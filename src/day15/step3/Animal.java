package day15.step3;

public abstract class Animal {
    //1.메소드 선언

    public void  breathe(){
        System.out.println("숨을 쉽니다");
    }

    //2.추상메소드 선언
    //1.클래스가 추상클래스이면 선언 가능
    //2.{}구현부를 생략 -> 오버라이딩으로 구현
    public abstract void sound();
}
