package day03;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        문제1 : 점수를 입력받아 점수가 90점 이상이면 '합격' 아니면 '불합격' 출력 하시오.
//        if (scanner.nextInt() >= 90) {
//            System.out.println("합격");
//        } else {
//            System.out.println("불합격");
//        }
////
////        문제2 : 점수를 입력받아 점수가 90점 이상이면 'A등급', 80점 이상이면 'B등급', 70점 이상이면 'C등급', 그외 '재시험' 으로 출력 하시오.
//        int a = scanner.nextInt();
//        if (a >= 90) {
//            System.out.println("A등급");
//        } else if (a >= 80) {
//            System.out.println("B등급");
//        } else if (a >= 70) {
//            System.out.println("C등급");
//        } else {
//            System.out.println("재시험");
//        }
////      문제3 : 임의의 정수 3개 를 입력받아서 오름차순 으로 3개의 변수를 출력하시오.
//            int a3 = scanner.nextInt();
//            int b3 = scanner.nextInt();
//            int c3 = scanner.nextInt();
//            if (b3 > c3) {
//                b3 = b3 ^ c3;
//                c3 = b3 ^ c3;
//                b3 = b3 ^ c3;
//            }
//            if (a3 > b3) {
//                a3 = a3 ^ b3;
//                b3 = a3 ^ b3;
//                a3 = a3 ^ b3;
//            }
//            if (b3 > c3) {
//                b3 = b3 ^ c3;
//                c3 = b3 ^ c3;
//                b3 = b3 ^ c3;
//            }
//            System.out.println(a3 + " " + b3 + " " + c3);
////      문제4 : 가위바위보 게임 구현하기.
////                - 가위가 '0' 이고 바위가 '1' 이고 보가 '2' 일때 플레이어1와 플레이어2 가 있습니다.
//            int a4 = scanner.nextInt();
//            int b4 = scanner.nextInt();
//            if (a4 == (b4 + 1) % 3) {
//                System.out.println("플레이어1 승리");
//            } else if (a4 == b4) {
//                System.out.println("무승부");
//            } else {
//                System.out.println("플레이어2 승리");
//            }
//
////        문제5 : 윤년/평년 판단하기
////   [ 윤년/평년 조건 ]
////        -연수가 4로 나누어 떨어지는 해는 윤년으로 한다.
////        -연수가 4, 100으로 나누어 떨어지는 해는 평년으로 한다.
////        -연수가 4, 100, 400으로 나누어 떨어지는 해는 윤년으로 둔다.
//            int a5 = scanner.nextInt();
//            if (a5 % 4 == 0) {
//                if (a5 % 100 == 0 && a5 % 400 != 0) {
//                    System.out.println("입력한" + a5 + "년은 평년입니다");
//                } else {
//                    System.out.println("입력한" + a5 + "년은 윤년입니다");
//                }
//            } else {
//                System.out.println("아무년도 아닙니다");
//            }
//
//
////
////    문제6 : 주차 사용요금 계산하기
////    [ 선언 변수 조건 ] 입차시간이 14시30분 입니다. int 시 = 14;  int 분 = 30;
////   [ 입력 조건 ] 현재시간의 시 와 분을 입력받아 각 변수에 저장하시오. *단 입차 시간 이전 으로 입력 할 경우에는 '현재시간오류' 출력하시오.
////   [ 처리출력 조건 ] 1분당 1000원으로 계산하여 사용요금' 0000원' 을 출력하시오,
//            System.out.print("시");
//            int a6 = scanner.nextInt();
//            System.out.print("분");
//            int b6 = scanner.nextInt();
//            if (a6 > 14 || (a6 == 14 && b6 >= 30)) {
//                System.out.println("주차요금 : " + (((a6 - 14) * 60) + b6 - 30) * 1000 + "원");
//            } else {
//                System.out.println("현재시간 오류");
//            }
////
//        문제7 : 로그인 처리
//   [입력 조건] 아이디[문자열] 와 비밀번호[문자열] 를 입력받기
//   [처리출력 조건]
//        1. 아이디가 'admin' 이고 비밀번호가 '1234' 모두 동일하면 '로그인성공'
//        2. 아이디가 다르면 '아이디 정보가 일치하지 않습니다.'
//        3. 아이디는 일치하고 비밀번호가 다르면 '비밀번호 정보가 일치하지 않습니다'
//
            String id = scanner.next();
            String pw = scanner.next();
            if (id.equals("admin")) {
               if(pw == "1234"){
                   System.out.println("로그인성공");
               }
               else{
                   System.out.println("비밀번호 정보가 일치하지 않습니다.");
               }
            }
            else {
                System.out.println("아이디 정보가 일치하지 않습니다.");
            }
//        문제7 : 당첨번호 개수  찾기
//                [ 선언 변수 조건 ] int 공1 = 14 ; int 공2 = 21 ; int 공3 = 9;
//        int a7 = scanner.nextInt();
//        int b7 = scanner.nextInt();
//        int c7 = scanner.nextInt();
////   [ 입력 조건 ] 세개의 정수를 입력받아 각 변수에 저장하시오.
//        if (a7 == b7){
//            if(b7==c7){
//                System.out.println("3개");
//            }
//            else {
//                System.out.println("2개");
//            }
//        }
//        else{
//            if(b7==c7||a7==c7){
//                System.out.println("2개");
//            }
//            else {
//                System.out.println("전부 다릅니다");
//            }
//        }
            int a7 = scanner.nextInt();
            int b7 = scanner.nextInt();
            int c7 = scanner.nextInt();
            int 공1 = 14;
            int 공2 = 21;
            int 공3 = 9;
            int result = 0;

            if (a7 == 공1 || a7 == 공2 || a7 == 공3) {
                result++;
            }
            if (b7 == 공1 || b7 == 공2 || b7 == 공3) {
                result++;
            }
            if (c7 == 공1 || c7 == 공2 || c7 == 공3) {
                result++;
            }
            System.out.println(result);

//   [ 출력 조건 ] 입력받은 세 정수 중에서 공1~공3 까지 동일한 번호 가 몇개 인지 출력하시오.
        }
    }