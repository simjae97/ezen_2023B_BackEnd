package day03;
import java.util.Scanner;
public class Step2 {
    public static void main(String[] args) {

        //예제1. :작성자, 내용,날짜 3가지를 입력받아 출력
        Scanner scanner = new Scanner(System.in);
//        System.out.print("작성자 : ");
//        String user = scanner.next();
//        System.out.print("내용 : ");
//        String content = scanner.next();
//        System.out.print("날짜 : ");
//        String date = scanner.next();
//        System.out.printf("==========================방문록=============================\n");
//        System.out.printf("%4s %10s %20s %10s\n" ,"번호","사용자","내용","날짜");
//        System.out.printf("%5d %10s %20s %10s\n" ,1,user,content,date);
        //예제2: 기본급과 수당을 입력받아  실 수령액 계산해서 출력
            //실 수령액: 기본급+수당-세금[기본급10%]
        System.out.print("기본급 :");
        int sal = scanner.nextInt();
        System.out.print("수당 :");
        int ex = scanner.nextInt();
        System.out.printf("실 수령액:%d",(int)(sal*0.9+ex) );
    }
}
