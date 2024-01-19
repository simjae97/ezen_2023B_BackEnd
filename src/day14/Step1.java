package day14;

class A{

}
class B extends A{

}

class C extends A{

}
class D extends B{

}
class E extends C{

}
public class Step1 {
    B b = new B();
    C c = new C();

    D d = new D();
    E e = new E();
    //A타입으로 자동 형변환
    A a1 = b;
    A a2 =c;
    A a3 =d;
    A a4= e;
    //BC타입으로 자동타입변환
    B b1= d;
    C c1 =e;

    //B b2 =e;
    //C c2 =d;
}
