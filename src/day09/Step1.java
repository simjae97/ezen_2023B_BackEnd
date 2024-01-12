package day09;

public class Step1 {
    public static void main(String[] args) {
        Calc aaa =new Calc();
        aaa.powerOn();
        int b =aaa.plus(5,6);
        System.out.println("b = " + b);

        int x = 10;
        int y =4;

        double result = aaa.divide(x,y);
        System.out.println("result = " + result);

        aaa.powerOff();
    }

}
