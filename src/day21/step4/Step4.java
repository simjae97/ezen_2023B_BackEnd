package day21.step4;

public class Step4 {
    public static void main(String[] args) {
        Home home = new Home();

        home.m3(new RemotControl() {
            @Override
            public void turnOn() {
                System.out.println("난방을 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("난방을 끕니다");
            }
        });
    }
}
