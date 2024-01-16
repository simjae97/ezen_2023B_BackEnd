package day10;

import java.io.*; //java.io는 생략 가능
import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication {

    //클래스멤버
    //1.필드
    static ArrayList<Account> accounts = new ArrayList<Account>();
    static Scanner scanner = new Scanner(System.in);
    //2.생성자
    //3.메소드
        //2.계좌 생성
    static void 계좌생성(){
        System.out.println("BankApplication.계좌생성");
        System.out.println("계좌 번호"); String 계좌번호 = scanner.next();
        System.out.println("계좌주 "); String 계좌주 = scanner.next();
        System.out.println("초기 입금액 :"); int 초기입금액 = scanner.nextInt();

        //2.객체 생성
            //1.풀 생성자 사용시
        Account account = new Account(계좌번호,계좌주,초기입금액);
            //2.빈생성자 Account acount = new Account; 해서 .내용물 삽입

        accounts.add(account);
    }

        //3.계좌목록

    static void 계좌목록(){
        System.out.println("BankApplication.계좌목록");
        for (Account i : accounts){
            System.out.println(i.계좌번호+" "+i.임급액+" "+i.계좌주);
        }
    }
        //4.예금
    static void 예금(){
        System.out.println("BankApplication.예금");
        System.out.println("예금) 계좌번호 "); String 계좌번호 = scanner.next();
        System.out.println("예금) 예금액 "); int 예금액 = scanner.nextInt();

        for (Account i : accounts){
            if(i.계좌번호.equals(계좌번호)){
                i.임급액 += 예금액;
                break;
            }
        }
    }
        //5.출금
    static void 출금(){
        System.out.println("BankApplication.출금");
        System.out.println("출금) 계좌번호 "); String 계좌번호 = scanner.next();
        System.out.println("출금) 출금액 "); int 예금액 = scanner.nextInt();

        for (Account i : accounts){
            if(i.계좌번호.equals(계좌번호)){
                i.임급액 -= 예금액;
                break;
            }
        }
    }
    static void 탈퇴(){
        System.out.println("탈퇴) 계좌번호 "); String 계좌번호 = scanner.next();
        for(int i =0; i<accounts.size(); i++){
            if (accounts.get(i).계좌번호.equals(계좌번호)){
                accounts.remove(i);
                System.out.println("탈퇴완료");

            }
        }
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("-------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제");
            System.out.println("선택>");
            int ch = scanner.nextInt();
            if(ch==1){계좌생성();}
            else if(ch==2){
                계좌목록();

            }
            else if(ch==3){
                예금();
            }
            else if(ch==4){
                출금();
            }
            else if (ch==5) {
                탈퇴();
            }
        }
    }

}
