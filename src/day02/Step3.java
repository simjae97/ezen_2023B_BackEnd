package day02;
import java.util.Scanner;
public class Step3 {
    public static void main(String[] args) {
        //콘솔에서 키보드로부터 입력받고 변수에 저장
            //준비물
            //1.scanner 클래스 :입력에 관련된 메소드/속성을 제공하는 설계도
            //2.scanner 클래스를 이용한 객체 생성
                //Scanner scanner = new Scanner(System.in);
                //클래스명 변수명 = new 클래스명(매개변수);
            //3.객체/변수 이용한 입력값 호출 메소드
                // 객체/변수명.nextLine():엔터키가 입력되면 지금까지 입력된 값 저장

          //2.변수에 대입       //1.객체생성
        Scanner scanner = new Scanner(System.in);


        System.out.print("x 값 입력 : ");
        //4.변수에 대입 //3.객체를 통한 메소드 호출
        int x       =      scanner.nextInt();
        System.out.print("y 값 입력 : ");
        int y = scanner.nextInt();
        int result = x+y;
        System.out.println(result);
        //Scanner 가 제공하는 메소드
        //1.입력받은 문자열(String)반환 띄어쓰기x
        String str1 = scanner.next();
        scanner.nextLine(); //의미없는 nextline을 추가해 하나로 묶어줌

        System.out.println("str1 = " + str1);
        // 2.입력받은 문자열(String)반환 띄어쓰기 포함 [주의할점: 앞에 next()가 있을경우 하나로 취급)
        String str2 = scanner.nextLine();
        System.out.println("str2 = " + str2);
        // 3.입력받은 논리(boolean) 반환
        boolean bool = scanner.nextBoolean();
        System.out.println("bool = " + bool);
        // 4.입력받은 바이트(byte) 반환
        byte b = scanner.nextByte();
        System.out.println("b = " + b);
        //5.쇼트 반환
        short s = scanner.nextShort();
        System.out.println("s = " + s);
        //6.인트반환
        int i = scanner.nextInt();
        System.out.println("i = " + i);
        //7.롱 반환
        long l = scanner.nextLong();
        System.out.println("l = " + l);
        float f = scanner.nextFloat();
        System.out.println("f = " + f);
        double d = scanner.nextDouble();
        System.out.println("d = " + d);
        //입력받은 문자 반환x ->문자열.charAt(추출인덱스)
        char ch = scanner.next().charAt(0);
        System.out.println("ch = " + ch);
        System.out.println("hello Wolrd");
    }
}
