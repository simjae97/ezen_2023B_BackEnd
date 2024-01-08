package 과제.팀과제1;

import java.util.Random;
import java.util.Scanner;

public class comVSuser {//class start
    public static void main(String[] args) {//main start

        Scanner scanner=new Scanner(System.in);
        Random random=new Random();


        //String 플레이어 = 입력값;   String 컴퓨터 = 난수.
        int 플레이어승리수 = 0;
        int 컴퓨터승리수 = 0;
        int i=0;    //com 인덱스

        while(true) {//while1 start
            while(true) {//while2 start
                //컴퓨터에서 생성된 난수를 String으로 강제변환
                String 컴퓨터 = String.valueOf(random.nextInt(3));
                //String을 다시 int 로 강제변환
                int com = Integer.parseInt(컴퓨터);
                //받은 값을 0:가위, 1:바위, 2:보 로 변경해서 대입
                컴퓨터=com==0? "가위" : com==1? "바위" : "보";

                //플레이어 입력값 console창으로 받기
                System.out.print("---------------------------------\n가위/바위/보 중 한가지를 입력해 주십시오.(새로운게임 : X) : ");
                String 플레이어 = scanner.next();

                //만약 플레이어가"x"를 입력했다면  승리 수 출력 후 초기화/ while2를 바로 탈출
                if(플레이어.equals("X")){//if start
                    System.out.printf("최종 승리 횟수 >> 플레이어 : %d회 | com%d : %d회\n",  플레이어승리수,i, 컴퓨터승리수);
                    플레이어승리수 = 0;
                    컴퓨터승리수 = 0;
                    System.out.println("새로운 게임을 시작합니다.");
                    break;  //while2 탈출
                }//if end

                //플레이어가 가위/바위/보 이외의 문자열을 입력하면 재입력 창이 생성된다.
                while (true) {
                    if (!플레이어.equals("가위")&&!플레이어.equals("바위")&&!플레이어.equals("보")&&!플레이어.equals("X")) {//if start
                        System.out.print("다시 입력 해 주십시오. : ");
                        플레이어 = scanner.next();
                    }//if end
                    else{
                        break;
                    }
                }


                //플레이어가 입력한 문자열에 따라 값을 넣는다.(가위 : 0, 바위 : 1, 보 : 2)
                int player = 플레이어.equals("가위") ? 0 : 플레이어.equals("바위") ? 1 : 2 ;
                
                //com 결과 출력
                System.out.println("com"+i+" : "+컴퓨터);

                //가위바위보 판정
                if (com == (player + 2) % 3) {//if start
                    플레이어승리수++;
                    System.out.printf("플레이어가 승리했습니다.\n(누적 승리 횟수 >> 플레이어 : %d회 | com%d : %d회)\n", 플레이어승리수,i, 컴퓨터승리수);
                }
                else if (com == player) {
                    System.out.printf("무승부 \n(누적 승리 횟수 >> 플레이어 : %d회 | com%d : %d회)\n", 플레이어승리수,i, 컴퓨터승리수);
                }
                else {
                    컴퓨터승리수++;
                    System.out.printf("com%d이 승리했습니다.\n(누적 승리 횟수 >> 플레이어 : %d회 | com%d : %d회)\n", i, 플레이어승리수, i, 컴퓨터승리수);
                }//if end
            }//while2 end
            i++;//com 인덱스 증가
        }//while1 end
    }//main end
}//class end
