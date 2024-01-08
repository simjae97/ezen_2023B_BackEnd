package day04;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;
        while (run){
            System.out.println("----------------------");
            System.out.println("1. 증속 | 2.감속 | 3.중지");
            System.out.println("----------------------");
            System.out.print("선택: ");
            //======무한반복 입력
            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 console이 대기상태로 됨
            //입력값에 따른 경우의 수 판단
            if(strNum.equals("1")){ //strNum 이 1이면
                speed++;
                System.out.println("speed = " + speed);
            }
            else if (strNum.equals("2")){ //2이면
                speed--;
                System.out.println("speed = " + speed);
            }
            else if(strNum.equals("3")){ //3이면
                run = false; //10번줄로 돌아가 while문 조건확인후 탈출
                //break; //가장 가까운 반복문 탈출-> 바로 while문 탈출
                //return; // 메인함수 종료시점으로 탈출
            }
        }
    }
}

//무한루프= 무한반복
//주의할점: 무한루프를 종료하는 조건문 필수