package day16.step1;

//추상클래스와 인터페이스를 사용하는 이유 = 다형성
public interface RemoteControl { //텔레비전 오디오 조작하는 리모콘
    //추상메소드 : 서로 다른 객체들간의 공통적인 메소드를 추출한 것
    //-1 선언부만 작성하고 구현부는 하지 않는다
    //-2
        //추상 클래스의 public 추상메소드는 abstract 명시 하지만
        //인터페이스의 public 추상메소드는 abstract 생략이 가능하다
    //텔레비전과 오디오의 공통적인 메소드 추출 = 전원버튼

    //-구현클래스: 추상메소드를 구현한 클래스
        //-구현클래스가 꼭 필요한 이유
        // 1. 추상클래스와 인터페이스는 스스로 객체를 생성할 수 없다.
    public void turnOn();
}
