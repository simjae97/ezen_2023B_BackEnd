package day04;

import java.util.Random;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //p.110
            //제어문 : 1.조건문 2.반복문
            //흐름제어: 조건문{}이후 정상흐름
            //          반복문{}이후 제어문으로 되돌아감 루핑
        //if문
            //if(조건식){실행문;실행문;}
            //if(조건식)실행문;
        //p.111
        int score = 93; //1.변수 초기화
        if (score >= 90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }
        if(score<90)
            System.out.println("점수가 90보다 작습니다");
        System.out.println("등급은 B입니다"); //else문과 상관없는 문자

        //p.113
        if (score >= 90){
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }
        else {
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B입니다");
        }
        //p.114
        if(score>=90){
            System.out.println("점수가 100~90입니다");
            System.out.println("등급은 A등급입니다.");
        }
        else if(score>=80){
            System.out.println("점수가 90~80입니다");
            System.out.println("등급은 B등급입니다");
        }
        else if(score>=70){
            System.out.println("정수가 80~70입니다");
            System.out.println("등급은 C등급입니다");
        }
        else {
            System.out.println("점수가 70미만입니다");
            System.out.println("등급은 D등급입니다");
        }
        //p.115 난수만들기 : Math.random(), Random 클래스
        //1 Math.random
        System.out.println("0~1 랜덤난수생성"+Math.random());
        //2.Random():난수 객체
        System.out.println(new Random());
        System.out.println(new Random().nextInt());
        //1.w주사위 만들기
        int num = (int)(Math.random()*6+1);
        System.out.println("num = " + num);
        //2.
        Random random = new Random();
        //클래스명 변수명 = new 클래스명(); //클래스에 해당하는 객체 생성(라이브러리 이용하기위해 만듬)
        int num2 = random.nextInt(6)+1;
        System.out.println("num2 = " + num2);

        if(num2 == 1){
            System.out.println("주사위가 1 입니다");
        }
        else if(num2 == 2){
            System.out.println("주사위가 2입니다");
        }
        else if(num2 ==3){
            System.out.println("주사위가 3입니다");
        }
        else if(num2 == 4){
            System.out.println("주사위가 4입니다");
        }
        else if(num2 == 5){
            System.out.println("주사위가 5입니다");
        }
        else if(num2 == 6){
            System.out.println("주사위가 6입니다");
        }
    }
}
