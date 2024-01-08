package 과제.팀과제1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int 플레이어승리수 = 0;
        int 컴퓨터승리수 = 0;
        int[] 승리수 = new int[2];
        String[] 플레이어 = new String[2];
        while (true){
            플레이어[0] = ((int)(Math.random()*3+1))+"";
            System.out.print("가위 바위 보 또는 X 입력 :" );
            플레이어[1] = scanner.nextLine();
            if (플레이어[1].equals("X")){
                System.out.printf("플레이어 승리수: %d , 컴퓨터 승리수: %d\n",승리수[0],승리수[1]);
                승리수[0] = 0;
                승리수[1] = 0;
                continue;
            }
            else if (플레이어[1].equals("가위")){
                플레이어[1] = 0+"";
            }
            else if(플레이어[1].equals("바위")){
                플레이어[1] = 1+"";
            }
            else if (플레이어[1].equals("보")) {
                플레이어[1] = 2+"";
            }
            else {
                System.out.println("잘못된 값을 입력받았습니다");
                continue; //현재 반복을 종료하고 다시 반복문맨 위로 올라감
            }

            if (플레이어[1].equals(((Integer.parseInt(플레이어[0]) + 1) % 3)+"")) {
                승리수[0]++;
                System.out.println("플레이어 승리");
            } else if (플레이어[1].equals(Integer.parseInt(플레이어[0])+"")) {
                System.out.println("무승부");
            } else {
                승리수[1]++;
                System.out.println("컴퓨터 승리");
            }
            System.out.printf("현재 플레이어승리수:%d 컴퓨터 승리수:%d\n",승리수[0],승리수[1]);
        }

    }
}
