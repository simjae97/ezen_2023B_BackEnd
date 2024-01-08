package day05;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //초기변수
        String[] 내용 = new String[3];
        String[] 작성자 = new String[3];
        int[] 비밀번호 = new int[3];


        while (true){
            System.out.println("========= 방문록 ==========");
            //6.현재 변수현황 출력
            for (int i= 0; i<내용.length; i++){
                //타입은 클래스이지만 null 비교시에는 비교 연산자 사용
                if(내용[i] != null) {
                    System.out.printf("%2d \t %5s \t %20s\n", i + 1, 작성자[i], 내용[i]);
                }
            }
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

                if(no >= 1 && no<=내용.length+1){
                    내용[no-1] = content;
                    작성자[no-1] = writer;
                    비밀번호[no-1] = password;
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
                if(no < 1 || no> 내용.length){
                    System.out.println("알수없는 위치입니다.");
                }
                if (비밀번호[no-1] == password) {
                    내용[no-1] = null;
                    작성자[no-1] = null;
                    비밀번호[no-1] = 0;

                }
                else {
                    System.out.println("패스워드가 다릅니다");
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
}
