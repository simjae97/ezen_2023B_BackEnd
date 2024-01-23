package day16.step1;

public class Step1 {
    public static void main(String[] args) {
        //1.인터페이스 변수 선언
        RemoteControl rc;
        //2.인터페이스 변수에 객체 참조값 대입
        rc = new Television(); // 다형성
            // 타입이 다른데 가능한 이유 : extends , implements
        // 3. 인터페이스의 메소드를 호출하면 구현객체의 메소드가 호출된다
        Television tv =new Television();
        tv.turnOn();
        rc.turnOn();

        RemoteControl rc2 = new Audio();
        rc2.turnOn();
    }
}
