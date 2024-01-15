package day10;

public class Car2 {
    //멤버
    //1.정적/인스턴스 필드
    int speed; // 인스턴스 필드
    static int speed2; //
    //2.생성자
    //3.(정적/인스턴스) 메소드
    void run(){} // 인스턴스 메소드
    static void simulate(){
//        System.out.println(this.speed); // 스태틱 메소드에서 인스턴스 필드 호출 불가능
        System.out.println(speed2); // 스태틱메소드에서 스태틱필드 호출 가능
    } //정적 메소드

    void simulate2(){
        System.out.println(this.speed); // 인스턴스 메소드에서 인스턴스 필드 호출가능
        System.out.println(speed); //인스턴스 메소드에서 스태틱 필드 호출 가능
    }

    public static void main(String[] args) { //메인함수는 클래스 없이 자바의 시작점이므로 정적 메소드로 사용
        simulate(); //스태틱구역에서 스태틱 메소드 호출 가능
        //simulate2(); //스태틱구역에서 인스턴스 메소드 사용 불가능
        //해결책:객체를 만든다
        int speed2 = 10;
        System.out.println("speed2 = " + speed2); //스택
        Car2 car2 = new Car2();
        System.out.println(car2.speed2); //메소드
        car2.speed = 1;
        System.out.println(car2.speed); //힙영역

    }
}
