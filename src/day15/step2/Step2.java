package day15.step2;

public class Step2 {
    public static void main(String[] args) {
        //1.추상 클래스의 객체 생성
        //Phone phone = new Phone("홍길동");오류

        Phone phone = new SmartPhone("심재훈");
        SmartPhone smartPhone = new SmartPhone("심재훈1");

        smartPhone.turnOn();
        smartPhone.turnOff();
        smartPhone.internetSearch();

        phone.turnOff();
        phone.turnOn();
    }
}
