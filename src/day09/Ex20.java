package day09;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Account[] BankApplication = new Account[100];
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("---------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("---------------------------------------");
            System.out.print("선택 > ");
            int no = scanner.nextInt();
            scanner.nextLine();
            if(no == 1){
                System.out.println("-------------");
                System.out.println("계좌생성");
                System.out.println("-------------");
                System.out.print("계좌번호:");
                String number = scanner.nextLine();
                System.out.print("계좌주:");
                String name =scanner.nextLine();
                System.out.print("초기입금액");
                int money =scanner.nextInt();

                Account account = new Account(number,name,money);
                for (int i =0; i<BankApplication.length; i++){
                    if (BankApplication[i] != null){
                        if(BankApplication[i].number.equals(account.number)) {
                            System.out.println("이미 존재하는 계좌번호입니다.");
                            break;
                        }
                    }
                    else {
                        BankApplication[i] = account;
                        System.out.println("계좌가 생성되었습니다");
                        break;
                    }
                }
            }
            if(no == 2){
                for (int i =0; i<BankApplication.length; i++){
                    if(BankApplication[i] != null){
                        System.out.println(BankApplication[i].number+"  "+BankApplication[i].name+"  "+BankApplication[i].money);
                    }
                    else{
                        break;
                    }
                }
            }
            if(no==3){
                System.out.print("계좌번호:");
                String a = scanner.nextLine();
                System.out.println("예금액: ");
                int b = scanner.nextInt();
                int location = -1;
                for (int i= 0; i<BankApplication.length; i++){
                    if(BankApplication[i] != null){
                        if(BankApplication[i].number.equals(a)){
                            location = i;
                            break;
                        }
                    }
                }
                if(location == -1){
                    System.out.println("선택한 계좌번호가 존재하지 않습니다.");
                    continue;
                }
                BankApplication[location].money += b;


            }
            if(no==4){
                System.out.print("계좌번호:");
                String a = scanner.nextLine();
                System.out.println("출금액: ");
                int b = scanner.nextInt();
                int location = -1;
                for (int i= 0; i<BankApplication.length; i++){
                    if(BankApplication[i] != null){
                        if(BankApplication[i].number.equals(a)){
                            location = i;
                            break;
                        }
                    }
                }
                if(location == -1){
                    System.out.println("선택한 계좌번호가 존재하지 않습니다.");
                    continue;
                }
                if (BankApplication[location].money >= b){
                    BankApplication[location].money -= b;
                    System.out.println("출금 성공");
                }
                else{
                    System.out.println("출금 실패");
                }
            if(no == 5){
                System.out.println("프로그램 종료");
                break;
            }


            }
        }
    }
}

class Account{
    String number;
    String name;
    int money;
    Account(String number , String name , int money){
        this.number = number;
        this.name = name;
        this.money = money;
    }
}