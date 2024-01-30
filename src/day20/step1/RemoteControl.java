package day20.step1;

public interface RemoteControl {

    //멤버
    //1. 상수[public static final] 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; //생략해도 인터페이스이므로 자동 퍼블릭 스태틱 파이널이 들어감
    //2. 추상[public abstract]메소드 //구현클래스에서 오버라이드를 필수로 요구
    void turnOn(); //선언부 작성 , 실행부 작성 안함
    void turnOff();
    void setVolume(int volume);
    //3. 디폴트[default 메소드
    default void setMute(boolean mute){ //선언부 작성, 실행부 작성 안함
        if(mute){
            System.out.println("무음처리합니다");
            setVolume(MIN_VOLUME);
        }
        else{
            System.out.println("무음 해제합니다");
        }
    }

    //4. 정적[static] 메소드
    static void changeBattery(){
        System.out.println("리모콘 건전지를 교체합니다");
    }

    // 5.private vs public
        // private : 내부에서만 접긋 가능
    //1.추상메소드 : 다른곳에서 구현을 해줘야하는 메소드.
    //private default void turnOff1(){}
    //2.디폴트 메소드 : 구현객체 필요
    //private default void turnoff2(){}
    // 3. 정적 메소드:구현객체 필요 없음
    private static void turnOff3(){}
}
