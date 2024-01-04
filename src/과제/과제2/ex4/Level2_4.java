package 과제.과제2.ex4;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Level2_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level2_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int com = random.nextInt(3);
		System.out.print("가위 바위 보 선택 : ");
		String player = scanner.next();
		
		/* 문제풀이 위치 */
		int userPick = -1;
		if (player.equals("가위")){
			userPick = 0;
		}
		if(player.equals("바위")){
			userPick = 1;
		}
		if (player.equals("보")) {
			userPick = 2;
		}

		System.out.println("comran) "+(com==0?"가위":com==1?"바위":"보"));
		if (userPick == (com + 1) % 3) {
			System.out.println("플레이어 승리");
		} else if (userPick == com) {
			System.out.println("무승부");
		} else {
			System.out.println("컴퓨터 승리");
		}
		/* ----------- */
	}
}
/* 
	[문제] 가위바위보 게임을 진행합니다.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 가위 바위 보 입력은 문자로 입력받습니다. [ player 변수 사용 ]
		3. 그림과 같이 컴퓨터가 낸 수를 출력합니다. [ com 변수 사용 ]
		4. 승리자를 출력합니다.

*/







