package day03;
import java.util.Scanner;
public class Step1 {
    public static void main(String[] args) {
        int x = 10; int y = 3;
        boolean z = true;
        //1.산술연산자
        System.out.println("x + y ="+(x+y));
        System.out.println("x - y ="+(x-y));
        System.out.println("x * y ="+(x*y));
        System.out.println("x / y ="+(x/y));
        System.out.println("x % y ="+(x%y));

        //2.비교연산자
        System.out.println("x == y ="+(x==y));
        System.out.println("x != y ="+(x!=y));
        System.out.println("x > y ="+(x>y));
        System.out.println("x >= y ="+(x>=y));
        System.out.println("x < y ="+(x<y));
        System.out.println("x <= y ="+(x<=y));
        //3.논리연산자
        System.out.println("!z ="+z);
        System.out.println("10< x < 20"+(x>10 && x<20));
        System.out.println("y==10 or y ==20"+(y == 10 || y ==20));
        //4.증감연산자
        System.out.println("x++ : "+(x++));
        System.out.println("x : "+x);
        System.out.println("x--: "+x--);
        System.out.println("x : "+x);
        System.out.println("++x : "+(++x));
        System.out.println("x :"+x);
        System.out.println("--x : "+(--x));
        System.out.println("x : "+x);
        //5.대입 연산자
        x = 30; //오른쪽 값을 왼쪽에 대입
        x += 10; //더한후에 결과 대입
        //6. 삼항연산자
            //조건?참:거짓
            //조건1? 참1:조건2?참2:거짓
        String 결과 = x>=90 ? "합격":"불합격";
        System.out.println(결과);

        결과 = x>=90?"A등급":x>=80?"B등급":"불합격";
        System.out.println(결과);
        //7.연결 연산자
        //변수 + "문자열", "문자열"+"문자열"
    }
}
