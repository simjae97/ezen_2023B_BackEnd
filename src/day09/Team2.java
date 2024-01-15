package day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz1 {
    static ArrayList<유저정보> 전체유저 = new ArrayList<유저정보>();

    public static void main(String[] args) {
        유저정보[] 전체유저 = new 유저정보[100];
        유저정보 유저1 = new 유저정보();
        구독[] 전체구독 = new 구독[100];
        유저정보 로그인중 = new 유저정보();
        Scanner scanner = new Scanner(System.in);
        boolean run2 = true;
        while (true) {
            System.out.println("------------------------------");
            System.out.println("1. 로그인 2. 회원가입");
            int ch = scanner.nextInt();
            scanner.nextLine();
            int userNum = -1;
            if (ch == 1) { // 로그인
                System.out.println("아이디와 비밀번호 입력");
                String id = scanner.nextLine();
                String pw = scanner.nextLine();
                for (int i = 0; i < 전체유저.length; i++) {
                    if (전체유저[i] != null) {
                        if (전체유저[i].아이디.equals(id) && 전체유저[i].비밀번호.equals(pw)) {
                            로그인중 = 전체유저[i];
                            break;
                        }
                    }
                }
            }
            if (ch == 2) { // 회원가입
                유저정보 신규가입 = new 유저정보();

                // 아이디 입력
                String id = "";
                boolean run = true;
                while (run) {
                    System.out.print("회원 가입할 아이디를 입력하세요 : ");
                    id = scanner.nextLine();
                    for (int i = 0; i < 전체유저.length; i++) {
                        if (전체유저[i] != null) { // i번째 유저가 존재 할 때
                            if (id.equals(전체유저[i].아이디)) { // i번째 아이디가 입력받은 id와 동일하면
                                System.out.println("중복된 아이디가 존재합니다. 다시하세요!");
                                break;
                            }
                        } else {
                            신규가입.아이디 = id;
                            run = false;
                        }
                    }

                }

                // 비밀번호 입력
                System.out.print("회원 가입할 비밀번호를 입력하세요 : ");
                String pw = scanner.nextLine();
                신규가입.비밀번호 = pw;

                // 이름입력
                System.out.print("회원 가입분의 이름을 입력하세요 : ");
                String name = scanner.nextLine();
                신규가입.이름 = name;

                //회원번호

                for (int i = 0; i < 전체유저.length; i++) {
                    int a = (int) (Math.random() * 100000000);
                    if (전체유저[i] != null) { // i번째 유저가 존재 할 때
                        if (a == 전체유저[i].유저번호) { // i번째 아이디가 입력받은 id와 동일하면
                            i = 0;
                            continue;
                        } else {
                            신규가입.유저번호 = a;
                            break;
                        }
                    }
                }

                for (int i = 0; i < 전체유저.length; i++) {
                    if (전체유저[i] == null) {
                        전체유저[i] = 신규가입;
                        break;
                    }
                }
                로그인중 = null;
            }

            while (로그인중 != null) {
                System.out.println("------------------------------");
                System.out.println("1. 로그아웃 2. 구독정보");
                int c = scanner.nextInt();
                scanner.nextLine();
                if(c == 1){
                    로그인중 = null;
                }
                if(c == 2){
                    if(로그인중.구독번호 == 0){
                        System.out.println("구독정보가 없습니다.");
                    } else {
                        for(int i =0; i<전체구독.length; i++){
                            if(전체구독[i] != null) {
                                if(로그인중.구독번호 == 전체구독[i].구독번호){
                                    System.out.println("구독정보");
                                    System.out.printf("타입 : %s\n" ,전체구독[i].타입);
                                    for( int j = 0; j<전체구독[i].구독인원.length; j++){
                                        System.out.println(j+"번째인원"+전체구독[i].구독인원[j]);
                                    }
                                    System.out.println("구독기간 :"+전체구독[i].구독기간);
                                    break;
                                }
                            }
                        }
                    }
                    while(run2) {
                        System.out.println("1.구독하기 2.기간연장 3.홈으로 돌아가세요");
                        String ch1 = scanner.nextLine();
                        if (ch1.equals("1")) {
                            구독 신규구독 = new 구독();
                            System.out.print("구독번호입력 : ");
                            int gNo = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("구독개월수 : ");
                            int month = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("구독타입입력(베이직,프리미엄 만 입력하세요.) : ");
                            String type = scanner.nextLine();
                            if (type.equals("베이직")) {
                                신규구독.구독인원[0] = 로그인중.아이디;
                            /*로그인중 = [1].구독번호 = 0;
                            로그인중.구독번호 = ㅁㅁㅁ;*/
                            } else if (type.equals("프리미엄")) {
                                신규구독.구독인원[0] = 로그인중.아이디;
                                System.out.print("친구1 입력 : ");
                                신규구독.구독인원[1] = scanner.nextLine();
                                System.out.print("친구2 입력 : ");
                                신규구독.구독인원[2] = scanner.nextLine();
                                System.out.print("친구3 입력 : ");
                                신규구독.구독인원[3] = scanner.nextLine();

                                for (int i = 0; i < 전체유저.length; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        if (전체유저[i] != null) {
                                            if (전체유저[i].아이디.equals(신규구독.구독인원[j])) {
                                                전체유저[i].구독번호 = gNo;
                                            }
                                        }
                                    }
//                                if(전체유저[i].아이디.equals(신규구독.구독인원[0]) ||전체유저[i].아이디.equals(신규구독.구독인원[1]) || 전체유저[i].아이디.equals(신규구독.구독인원[2]) || 전체유저[i].아이디.equals(신규구독.구독인원[3])){
//                                }
                                }
                            }
                            신규구독.구독번호 = gNo;
                            신규구독.타입 = type;
                            신규구독.구독기간 = month;

                            for (int i = 0; i < 전체구독.length; i++) {
                                if (전체구독[i] == null) {
                                    전체구독[i] = 신규구독;
                                    break;
                                }
                            }

                        } else if (ch1.equals("2")) { // 기간 연장
                            System.out.print("연장할 기간을 입력하세요 : ");
                            int plusM = scanner.nextInt();
                            scanner.nextLine();
                            for (int i = 0; i < 전체구독.length; i++) {
                                if (전체구독[i] != null) {
                                    if (전체구독[i].구독번호 == 로그인중.구독번호) {
                                        전체구독[i].구독기간 += plusM;
                                    }
                                }
                            }
                        } else if (ch1.equals("3")) {
                            run2= false;
                        } else {
                            System.out.println("다시 입력해!");
                        }
                    }
                }


            }
        }
    }
}

class 유저정보{
    String 이름;
    int 유저번호;
    String 아이디;
    String 비밀번호;
    int 구독번호;
//  필수x
    String 회사명;
    String 주소;
    String 전화번호;
    String 이메일;

}

class 구독{
    int  구독번호;
    String[] 구독인원 = new String[4];
    String 타입;
    int 구독기간;


}
