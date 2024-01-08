package 과제.팀과제1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 플레이어승리수 = 0;
        int 컴퓨터승리수 = 0;
        while (true){
            String 컴퓨터 = ((int)(Math.random()*3+1))+"";
            System.out.print("가위 바위 보 또는 X 입력 :" );
            String 플레이어 = scanner.nextLine();
            if (플레이어.equals("X")){
                System.out.printf("컴퓨터 승리수: %d , 플레이어 승리수: %d\n",컴퓨터승리수,플레이어승리수);
                플레이어승리수 = 0;
                컴퓨터승리수 = 0;
                continue;
            }
            else if (플레이어.equals("가위")){
                플레이어 = 0+"";
            }
            else if(플레이어.equals("바위")){
                플레이어 = 1+"";
            }
            else if (플레이어.equals("보")) {
                플레이어 = 2+"";
            }
            else {
                System.out.println("잘못된 값을 입력받았습니다");
                continue; //현재 반복을 종료하고 다시 반복문맨 위로 올라감
            }

            if (플레이어.equals(((Integer.parseInt(컴퓨터) + 1) % 3)+"")) {
                플레이어승리수++;
                System.out.println("플레이어 승리");
            } else if (플레이어.equals(Integer.parseInt(컴퓨터)+"")) {
                System.out.println("무승부");
            } else {
                컴퓨터승리수++;
                System.out.println("컴퓨터 승리");
            }
            System.out.printf("현재 플레이어승리수:%d 컴퓨터 승리수:%d\n",플레이어승리수,컴퓨터승리수);
        }

    }
}
