package day20.step1;

public class Step1 {
//    RemoteControl remoteControl = new RemoteControl() { //익명구현체
//        @Override
//        public void turnOn() {
//
//        }
//
//        @Override
//        public void turnOff() {
//
//        }
//
//        @Override
//        public void setVolume(int volume) {
//
//        }
//    }

    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
        RemoteControl remoteControl;
        // 2. 구현객체 선언
        new Audio();
        //3.구현객체의 참조값을 인터페이스 변수에 대입
        remoteControl = new Audio();
        remoteControl.turnOn();
        remoteControl.setVolume(5);
        remoteControl.setMute(true);
        remoteControl.setMute(false);
        remoteControl.turnOff();

        //4.인터페이스의 정적 메소드 호출
        RemoteControl.changeBattery();

    }
}
