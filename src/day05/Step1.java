package day05; //패키지

import java.util.Scanner;

public class Step1 { //클래스
    public static void main(String[] args) { //메인함수
        Scanner scanner = new Scanner(System.in);
        //초기변수
        String 내용1= ""; String 작성자1 = ""; int 비밀번호1 = 0;
        String 내용2= ""; String 작성자2 = ""; int 비밀번호2 = 0;
        String 내용3= ""; String 작성자3 = ""; int 비밀번호3 = 0;


        while (true){
            System.out.println("========= 방문록 ==========");
            //6.현재 변수현황 출력
            System.out.printf("%2d \t %5s \t %20s\n",1, 작성자1,내용1);
            System.out.printf("%2d \t %5s \t %20s\n",2, 작성자2,내용2);
            System.out.printf("%2d \t %5s \t %20s\n",3, 작성자3,내용3);
            System.out.println("1.방문록 작성 2.방문록 삭제 3.종료");
            System.out.print("선택: ");
            int ch = scanner.nextInt();

            // 사용자가 입력한 경우의수의 다른 기능 처리
            if (ch == 1){
                System.out.print("방문록 작성위치: 1. 2. 3");
                int no = scanner.nextInt();
                scanner.nextLine();
                System.out.print("내용 :");
                String content = scanner.nextLine();
                System.out.print("작성자 : ");
                String writer = scanner.next();
                System.out.print("비밀번호 :");
                int password = scanner.nextInt();

                if(no == 1){
                    내용1 = content;
                    작성자1 = writer;
                    비밀번호1 = password;
                }
                else if(no== 2){
                    내용2 = content;
                    작성자2 = writer;
                    비밀번호2 = password;
                }
                else if(no == 3){
                    내용3 = content;
                    작성자3 = writer;
                    비밀번호3 = password;
                }
                else{
                    System.out.println("알수없는 위치입니다:");
                }
            }
            else if (ch == 2){
                System.out.print("방문록 삭제위치: 1. 2. 3");
                int no = scanner.nextInt();
                System.out.print("비밀번호 :");
                int password = scanner.nextInt();
                //초기화 : 위치와 비밀번호일치에 따른 각 변수를 처음으로 대입
                if (no == 1 && 비밀번호1 == password) {
                    내용1 = "";
                    작성자1 = "";
                    비밀번호1 = 0;
                }
                else if (no == 2 && 비밀번호2 == password) {
                    내용2 = "";
                    작성자2 = "";
                    비밀번호2 = 0;

                }
                else if( no == 3 && 비밀번호3 == password) {
                    내용3 = "";
                    작성자3 = "";
                    비밀번호3 = 0;
                }
                else if( no>=1 && no <= 3){
                    System.out.println("패스워드가 다릅니다");
                }
                else {
                    System.out.println("알수없는 위치입니다");
                }
            }
            else if (ch == 3){
                break;
            }
            else{
                System.out.println("[경고]알수없는 입력입니다.");
            }
        }

    }
/*
    현재 방문록에 현황 출력
        1.초기메뉴에서 9개변수를 형식 맞춰 모두 출력
    1.방문록 작성 삭제 종료

    2. 방문록에는 내용 작성자 비밀번호를 최대 3명만 작성 가능하도록 설계
    -내용(문자열),작성자(문자열),비밀번호(정수)
    -변수개수 9개


*/
}
