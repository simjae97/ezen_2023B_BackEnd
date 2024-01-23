package day16.step1;


//구현클래스: 일반클래스가 인터페이스의 추상메소드를 구현했으면 구현클래스라 호칭
public class Television implements RemoteControl{
    //impements 재정의한 메소드가 없으면 오류가 나옴
    //따라서 무조건 오버라이딩 해야함
    @Override
    public void turnOn(){
        System.out.println("Tv를 켭니다");
    }
}

/*

    오버로딩 : 생성자/메소드에서 매개변수의 타입/개수/순서에 따라 여러개 선언
    오버라이딩: 메소드에서 extends/implements한 메소드를 재정의
 */