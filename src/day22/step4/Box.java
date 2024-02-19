package day22.step4;

public class Box <T>{
    // 제네릭 타입: 클래스 선언시 타입을 정하지 않고 사용

    private T t; // t필드는 제네릭타입(정해져 있지 않다)

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
