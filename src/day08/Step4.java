package day08;

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
                    System.out.printf("%d %5s\n",i+1,phoneBook[i].toString());
                }

            }
            System.out.println("1.전화번호 등록 2.전화번호 삭제");
            int no = scanner.nextInt();
            scanner.nextLine();
            if(no == 1){
                //입력받기
                System.out.println("이름,전화번호 형식으로 입력");
                String[] arr = scanner.nextLine().split(",");
                //2.객체 생성한다.
                for (int i =0; i< phoneBook.length; i++){
                    if(phoneBook[i] == null){ //빈공간에 찾아서 넣기
                        Phone phone = new Phone(arr[0],arr[1]); //기본생성자 사용안할시
                        /*
                              기본생성자 사용시
                              Phone phone = new Phont();
                              phone.user = arr[0];
                              phone.number =arr[1];
                        */
                        phoneBook[i] = phone;
                        break; //한번 넣었으면 탈출

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

//1.전화번호 1개에 해당하는 설계도
class Phone{

    //1.필드
    private String user;
    private String number;

    Phone(String user, String number){
        this.user =user;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "user='" + user + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}


/*

    2.배열: 동일한 타입의 자료형을 순서(인덱스)대로 나열
        //1.
        String[] 이름들 = {"유재석","강호동"}
        String[] 전화번호들 = {"010-3333-3333", "010-4444-4444"}

        //2.
        String[] 전화번호부 = {"유재석","010-3333-3333","강호동","0101-4444-4444'}

    3.문자열: 모든 데이터를 문자형식으로 해서 하나의 문자열 저장
        //-구분자:
        String 전화번호부="유재석,010-3333-3333\n강호동,010-4444-4444"

    4.객체:클래스/설계기반으로 생성된 메모리
        -필드를 이용한 데이터 구분
        -생성자를 이용한 초기화 가능
        -메소드를 이용한 이벤트 가능

        //1.틀 만들기[클래스 만들기]
        class Phone{
            멤버: 필드,생성자,메소드
       }

       //2. 틀 기준으로  메모리 생성 [객체 만들기]

 */