package day21.step3;

public class Step3 {

    public static void main(String[] args) {
        Car car = new Car();

        car.run3(new Tire(){
            // tire 클래스로부터 자동 상속받은 객체 생성 정의
            public void roll(){
                System.out.println("기아 타이어가 굴러갑니다.");
            }
        });
    }
}
