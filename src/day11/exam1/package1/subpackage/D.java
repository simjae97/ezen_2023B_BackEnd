package day11.exam1.package1.subpackage;

import day11.exam1.package1.A2;

public class D {
    public static void main(String[] args) {
        //하위패키지
        A2 a = new A2();

        a.field1 = 1; //퍼블릭
        //a.field2 = 2; //디폴트
        //a.field3 = 1;//프라이빗

        a.method1();//퍼블릭
        //a.method2(); //디폴트
        //a.method3(); //프라이빗
    }
}
