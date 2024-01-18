package day13;

/*
    -(접근제한자) (final) class 클래스명{}
    -(접근제한자)(static/instance) (final) 타입 필드명
    -(접근제한자) 생성자(){}
    -(접근제한자)(스태틱/인스턴스)(파이널)타입 메소드명(){}

    -지역변수:함수안에서
        어차피 함수가 끝나면 사라지므로 외부 호출이 불가능 -> 접근제한자를 쓸 이유가 없음
     정적 멤버는 인스턴스 멤버를 사용 불가능
 */
public class SportCar extends Car {
    //1.final이 없으면 오버라이딩 가능
    @Override
    public void speedUp(){
        speed += 10;
    }
    //public void stop() 오버라이딩 불가능
}
