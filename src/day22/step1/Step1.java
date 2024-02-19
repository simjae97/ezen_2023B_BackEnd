package day22.step1;

public class Step1 {

    public static void main(String[] args) {
        //1.특정 타입의 필드가 아닌 다형성을 이용한 다양한 타입의 필드
        Box box = new Box();
        box.content1 = "안녕하세요";
        //1. 클래스를 생성할 때 <T>제네릭 타입 정의
        Box2<String> box2 = new Box2<>();

        box2.content = "안녕하세요";
        System.out.println(box2.content);
        String contents = box2.content;

    }
}