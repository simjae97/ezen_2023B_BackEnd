package day11;

public class Singleton {

    //-단 하나의 객체를 만드는 방법 제공
    //1. 생성자를 외부로부터 호출 불가능으로 만든다
    private Singleton(){}
    //2.필드에 미리 객체를 만든다
    //Singleton singleton = new Singleton();
    //2-2.필드에 직접적인 접근도 막는다
    //private Singleton singleton = new Singleton();
    //2-3 정적 필드로도 만든다

    private static Singleton singleton = new Singleton();
    //3.필드 간접접근을 이용한 싱글톤 반환
    public static Singleton getInstance() {
        return singleton;
    }
}
