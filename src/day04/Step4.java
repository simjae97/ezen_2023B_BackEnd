package day04;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 0;
        boolean run = true;
        while (run){
            System.out.println("----------------");
            System.out.println("1.예금 | 2.출금 |3.잔고 | 4.종료");
            System.out.println("----------------");
            System.out.print("선택 :");
            String a = scanner.nextLine();
            if(a.equals("1")){
                System.out.print("예금액 :");
                money += Integer.parseInt(scanner.nextLine());
            }
            else if(a.equals("2")){
                System.out.print("출금액 : ");
                money -= Integer.parseInt((scanner.nextLine()));
            }
            else if(a.equals("3")){
                System.out.println("잔고"+money);
            }
            else if(a.equals("4")){
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}
