package day05;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] 학생수 = null;
        int value = 0;

        while (true){
            System.out.println("----------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------------------------------------");
            System.out.print("선택 >");
            int no = scanner.nextInt();

            if (no == 1){
                System.out.print("학생수 >");
                value = scanner.nextInt();
                학생수 = new int[value];
            }
            else if (no == 2) {
                if (학생수 == null) {
                    System.out.println("먼저 학생수를 입력하세요.");
                }
                else {
                    for (int i = 0; i < value; i++) {
                        System.out.print((i + 1) + "번 학생의 점수 입력 > ");
                        학생수[i] = scanner.nextInt();
                    }
                    System.out.println("점수 입력이 완료되었습니다.");
                }
            }
            else if (no == 3) {
                if (학생수 == null){
                    System.out.println("먼저 학생수를 입력하세요.");
                }
                else{
                    for (int i = 0; i<value; i++){
                        System.out.println((i+1)+"번 학생의 점수:"+학생수[i]);
                    }
                }
            }
            else if (no == 4){
                if (학생수 == null){
                    System.out.println("먼저 학생수를 입력하세요.");
                }
                else{
                    int max = 0;
                    int sum = 0;
                    for (int i= 0; i<value; i++){
                        sum += 학생수[i];
                        if(max < 학생수[i]){
                            max = 학생수[i];
                        }

                    }
                    System.out.println("평균 :"+(double)(sum)/학생수.length);
                    System.out.println("1등: "+max);
                }
            }
            else if (no == 5) {
                break;

            }
            else{
                System.out.println("잘못된 값 입력");
            }
        }
    }
}
