package day21.step4;

public class Home {

    private RemotControl rc = new RemotControl() {
        //1.필드 o
        //2.생성자 X

        @Override
        public void turnOn() {
            System.out.println("Tv를 켭니다");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv를 끕니다");
        }
    };
    //지역변수에 대입
    public static void main(String[] args) {
        RemotControl rc = new RemotControl() {
            @Override
            public void turnOn() {
                System.out.println("Tv를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다");
            }
        };
    }
    //매개변수에 익명함수 대입
    public void m3(RemotControl rc){
        rc.turnOn();
        rc.turnOff();
    }
}
