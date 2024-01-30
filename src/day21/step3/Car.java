package day21.step3;

public class Car {
    private Tire tire1 = new Tire();
    //익명 자식 객체
        // - 자식객체 : private Tire tire2 = new KumhoTire();
        // - 익명 자식객체 : private tire tire2 = new Tire(){재정의}
    private Tire tire2 = new Tire(){
        public void roll(){
            System.out.println("금호타이어가 굴러갑니다");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }
    public void run2(){
        Tire tire = new Tire(){
            int speed = 0;
            public void roll(){
                System.out.println("한국 타이어가 굴러갑니다.");
            }
        };
    }
    //3.익명 자식객체를 대입
    public void run3(Tire tire){
        tire.roll();
    }
}
