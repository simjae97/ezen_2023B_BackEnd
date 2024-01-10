package day07;

public class Step2 {
    public static void main(String[] args) {
        //p.215
        //1.객체생성
            //1.new

            //2.생성자/클래스명

            //3.변수 선언
        Car car = new Car();
        //.:접근 연산자: 변수가 가지고있는 주소로 이동
        System.out.println("모델명 : "+car.model);
        System.out.println("시동여부 : "+car.start);
        System.out.println("속도 : "+car.speed);
        
        Car car2 = new Car();
        System.out.println("모델명 : "+car2.model);
        System.out.println("시동여부 : "+car2.start);
        System.out.println("속도 : "+car2.speed);
        
        //p.217
        //필드는 객체의 데이터 이므로 객체가 존재하지 않으면 필드도 존재하지 않는다.
        //1.객체 생성
        Car2 mycar2 = new Car2();
        System.out.println("mycar2.company = " + mycar2.company);
        System.out.println("mycar2.model = " + mycar2.model);
        System.out.println("mycar2.color = " + mycar2.color);
        System.out.println("mycar2.maxspeed = " + mycar2.maxspeed);
        System.out.println("mycar2.speed = " + mycar2.speed);

        mycar2.speed = 60;
        System.out.println("mycar2.speed = " + mycar2.speed);

        Car2 yourcar2 = new Car2();
        System.out.println("yourcar2.company = " + yourcar2.company);
        System.out.println("yourcar2.model = " + yourcar2.model);
        System.out.println("yourcar2.color = " + yourcar2.color);
        System.out.println("yourcar2.maxspeed = " + yourcar2.maxspeed);
        System.out.println("yourcar2.speed = " + yourcar2.speed);
    }
}
