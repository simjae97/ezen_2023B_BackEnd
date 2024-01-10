package day07;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Phone[] phoneBook = new Phone[100];
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("===========전화번호부=============");
            if (phoneBook[0] != null){
                System.out.printf("%s %5s %10s","순번","이름","전화번호부\n");
                for (int i= 0; i<phoneBook.length; i++){
                    if (phoneBook[i] == null){
                        break;
                    }
                    System.out.printf("%d %5s %10s\n",i+1,phoneBook[i].user,phoneBook[i].number);
                }

            }
            System.out.println("1.전화번호 등록 2.전화번호 삭제");
            int no = scanner.nextInt();
            scanner.nextLine();
            if(no == 1){
                System.out.println("이름,전화번호 형식으로 입력");
                String[] arr = scanner.nextLine().split(",");
                for (int i =0; i< phoneBook.length; i++){
                    if(phoneBook[i] == null){
                        Phone phone = new Phone();
                        phone.user = arr[0];
                        phone.number = arr[1];
                        phoneBook[i] = phone;
                        break;

                    }
                }
            }
            else if (no == 2){
                System.out.println("삭제하고 싶은 번호 입력");
                int a = scanner.nextInt();
                phoneBook[a-1]= null;
                for (int i = a-1; i< phoneBook.length-1; i++){
                    phoneBook[i] = phoneBook[i+1];
                }
            }
        }
    }
}

class Phone{
    String user ="";
    String number = "";
}