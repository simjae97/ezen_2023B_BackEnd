package 과제.과제4.ex4;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_4 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_4 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] X_AXIS = new String[5];
		int x = 0;
		X_AXIS[ x ] = "★";

		while ( true ) {
			/* 문제풀이 위치 */
			for (String i:X_AXIS){
				System.out.print(i);
			}
			System.out.println("\n1.전진 2.후진 선택");
			int b= 0;
			for (int i =0; i < X_AXIS.length; i++){
				if(X_AXIS[i] == "★"){
					b = i;
				}
			}
			int a = scanner.nextInt();
			if(a==1){
				String temp = X_AXIS[b];
				X_AXIS[b] = X_AXIS[b+1];
				X_AXIS[b+1] = temp;
			}
			if(a==2){
				String temp = X_AXIS[b];
				X_AXIS[b] = X_AXIS[b-1];
				X_AXIS[b-1] = temp;
			}


			/* ----------- */
		}
	}
}
/* 
	[문제]
		1. String[] X_AXIS = new String[5]; : 문자열 배열 입니다.

		2. 기능선택
			1 입력시 별이 왼쪽으로 이동
			2 입력시 별이 오른쪽으로 이동
			- 만일 배열의 길이보다 벗어나면 최소 또는 최대 위치로 지정하시오.

		3. 그림과 배열의 항목/요소 들을 모두 출력하시오.

		4. 아래 변수들을 활용하시오.
			String[] X_AXIS = new String[5];
			int x = 0;
			X_AXIS[ x ] = "★";
*/
