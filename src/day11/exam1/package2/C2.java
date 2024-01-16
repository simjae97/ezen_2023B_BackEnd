package day11.exam1.package2;

import day11.exam1.package1.A2;

public class C2 {

    A2 a1 = new A2(true); //퍼블릭가능

    //A2 a2 =new A2(1); // 디폴트 불가능
    //A2 a3 = new A2("문자열");//프라이빗 불가능

    public static void main(String[] args) {
        //다른 패키지
        A2 a = new A2();

        a.field1 = 1; //퍼블릭
        //a.field2 = 2; //디폴트
        //a.field3 = 1;//프라이빗

        a.method1();//퍼블릭
        //a.method2(); //디폴트
        //a.method3(); //프라이빗
    }
}
