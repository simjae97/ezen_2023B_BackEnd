package day13.step4.pac2;
import day13.step4.pac1.A;
public class D extends A {

    public void method1(){
        this.field = "value"; //부모의 필드 호출// 자동으로 생성된 부모의 객체에만 허용되는것
        this.method(); // 부모의 메소드 호출 가능
    }

    public void method2(){
//        A a = new A();//직접 객체생성은 불가능
//        a.field = "value";
//        a.method();
    }
}
