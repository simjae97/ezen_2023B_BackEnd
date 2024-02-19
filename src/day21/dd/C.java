package day21.dd;

public class C extends M{
    public int a = 1000;

    public int getA() {
        return a;
    }

    public void a(){
        System.out.println("이것은 오버라이딩한 자식객체의 내용입니다. 그리고 자식의 필드를 업캐스팅해도 호출할수있나요?:"+a);
    }
}
