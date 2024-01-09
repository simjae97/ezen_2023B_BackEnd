package day06;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        //p.153 문자열 타입
        //1.문자열 선언: String 클래스 사용
        String name; //스택영역(변수)선언
        name = "홍길동";//스택영역에 힙영역(객체)의 주소 대입
        String hobby = "여행"; //힙영역(객체)의 주소를 스택 영역에 대입

        //2. 문자열 비교
            //1.==
        String name1 = "홍길동"; // 힙영역???
        String name2 = "홍길동"; // 힙영역??
        System.out.println(name2==name1); // 같다
            //2.new 연산자:객체를 생성할 때 사용되는 키워드
        String name3 = new String("홍길동"); //
        System.out.println(name1==name3); //다르다

        //3. .접근연산자 : 현재참조(객체)로 이동
        System.out.println(name1.equals(name2)); //true
        System.out.println(name2.equals(name3)); // true 스택이 가지는 주소/참조의 내부 비교

        //4,
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.next(); //new 문자열
        System.out.println(name1 == inputName);
        System.out.println(name1.equals(inputName));

        //5. null(객체 X) vs "" vs " "
        String hobby2 = "";
        if(hobby2.equals("")){
            System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열입니다");
        }
        String hobby3 = null;
         if(hobby3 != null && hobby3.equals("")){
             //hobby3은 객체가 아니므로  .사용불가능
         }
    }
}