package day13.step4.pac1;

public class B {

    public void method(){
        A a = new A();//같은 패키지이니까 가능
        a.field = "value";
        a.method();

    }
}
