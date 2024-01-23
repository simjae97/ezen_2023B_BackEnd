package day15.test;

public class Child extends Parent{
    @Override
    public void method1() {
        System.out.println("부모의 메소드를 오버라이딩 했습니다.");
    }
    public void method2(){
        System.out.println("자식의 메소드입니다");
    }
}
