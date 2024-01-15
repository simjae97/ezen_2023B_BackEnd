package day10;

import java.util.Arrays;

public class Computer {

    //클래스 멤버

    //1.필드

    //2.생성자

    //3.메소드
    int sum(int ...value){
        int a= 0;
        System.out.println("value = " + value);
        System.out.println("value = " + Arrays.toString(value));
        for (int i:value){
            a +=i;
        }
        return a;
    }

    int sum3(int[] values){

        System.out.println("values = " + Arrays.toString(values));
        return 0;
    }
}
