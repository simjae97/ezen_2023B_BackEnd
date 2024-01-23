package day15.step1;

public class Step1 {
    public static void main(String[] args) {
        //드라이버 객체 생성
        Driver driver = new Driver();
        //매개값으로 버스객체를 제공하고 드라이버 메소드 호출
        Bus bus = new Bus();
        driver.drive(bus); // 얘는 원래 Vehicle로 받아야됨 원래 버스였는데 바이클로 자동형변환이됨
        //Vechile.run을 실행했는데 bus로 오버라이딩된 bus.run()이 실행
        //매개값으로 택시객체를 제공하고 드라이버 매소드 호출
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
