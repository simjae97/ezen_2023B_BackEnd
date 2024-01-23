package day15.step3;

//부모클래스를 다형성(타입변환)목적으로 많이 사용되서 추상클래스가 나옴
public class Dog extends Animal{
    public void sound(){
        System.out.println("월월");
    }
}
