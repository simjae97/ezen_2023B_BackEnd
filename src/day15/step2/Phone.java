package day15.step2;

public abstract class Phone { //추상클래스 : 서로다른 클래스들의 공통적인 필드/메소드 설계
    //필드
    String owner;
    //생성자

    Phone(String owner){
        this.owner = owner;
    }
    //메소드
    abstract void turnOn();
    void turnOff(){
        System.out.println("전원을 끕니다");
    }
}
