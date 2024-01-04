package day03;

import java.util.Scanner;

public class Step4 { //c s
    public static void main(String[] args) { //main s

        Scanner scanner = new Scanner(System.in);
        //if 조건문
        //1.
        System.out.print("정수 입력:"); int point = scanner.nextInt();
        if (point >= 80){
            System.out.println("입력받은 값은 80이상입니다");
        }
        //2.
        if(point >= 90){
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }
        //3.{}는 무조건 한번실행
        if(point>=90){
            System.out.println("A등급");
        }
        else if(point>=80){
            System.out.println("B등급");
        }
        else if(point>=70){
            System.out.println("C등급");
        }
        else {
            System.out.println("불합격");
        }
        //vs 조건에 따라 {}여러번 실행
        if(point>=90){
            System.out.println("A등급");
        }
        if(point>=80){
            System.out.println("B등급");
        }
        if(point>=70){
            System.out.println("C등급");
        }
        //4.중첩 조건
        char sex = 'M';
        if(sex =='M'||sex=='m'){
            if(point >= 90){
                System.out.println("남자 우수상");
            }
            else {
                System.out.println("남자 다윈상");
            }
        }
        else {
            if(point>=90){
                System.out.println("여자 우수상");
            }
            else {
                System.out.println("여자 다윈상");
            }
        }
        String id = scanner.next();
        String pw = scanner.next();
        boolean sw = false;
        if( id.equals("admin") && pw.equals("1234")){
            sw = true;
        }
        if(sw){
            System.out.println("로그인성공");
        }
        else {
            System.out.println("로그인 실패");
        }
    } //main e
} // c e
/*
    if 문 [조건문]
        -경우의수(조건)따른 실행 흐름제어
        -조건:boolean
            if(true),if(false)
            boolean 변수 = true; if(변수)
            if(3>5) , if(3>5 && 3 < 10)
            int 변수 = 10; if(변수 - 10 > 5)
         삼항연산:간단한 조건식 vs 조건문:일반적으로 사용
         1. 삼항연산자 단점:
            1.조건이 길어지면 읽기 힘듬
            2.함수 정의와 실행에 제약이 있음
        2.조건문
            {}을 이용한 코드의 묶음 처리
       형태
        1.if(조건){ 참 선언문;실행문 }
        2.if(조건){ 참 선언문;실행문}
        else{거짓 선언문;실행문}
        3. 하나의 {}실행
        if(조건1){참1 선언문; 실행문;}
        else if(조건2){참2 선언문; 실행문;}
        else if(조건3){참3 선언문; 실행문;}
        else{거짓 선언문; 실행문;}
        4.여러개 {}실행
        if(조건1){참1 선언문; 실행문;}
        if(조건2){참2 선언문; 실행문;}
        if(조건3){참3 선언문; 실행문;}
        5.중첩
        if(조건){
            if(조건2){}
            else{}
        }
        else{}
*/