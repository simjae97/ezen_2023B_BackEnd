package day14;

public class Step3 {
    //1.객체생성
    public static void main(String[] args) {
        Car car = new Car();
        //2.객체의 필드값 수정 -> 타이어 장착
        car.tire = new Tire();
        car.run();
        car.tire = new HankookTire();
        car.run();
        car.tire =new KumhoTire();
        car.run();
    }

}
