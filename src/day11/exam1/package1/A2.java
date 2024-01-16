package day11.exam1.package1;


public class A2 {

    //필드와 메소드 접근제한자
    public int field1;
    int field2;
    private int field3;
    protected int field4;
    public A2(){
        field1 =1;
        field2 = 1;
        field3 = 1;
        field4 = 1;

        method1();
        method2();
        method3();
    }
    public void method1(){

    }
    void method2(){}
    private void method3(){}
    public A2(boolean b){} //퍼블릭

    A2 a1 = new A2(true);

    A2(int b){}     //디폴트
    A2 a2 = new A2(1);

    private A2(String s){}  //프라이빗
    A2 a3 =new A2("문자열");
}
