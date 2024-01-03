package day02; //패키지명

import java.util.Arrays;

public class Step2 { //class s
    public static void main(String[] args) { // main s

        int result1 = 10+2+8;
        System.out.println(result1+"10");//문자열("10")을 연결 //2010

        // p.64 문자열을 기본타입으로 변환
            //java와 애플리케이션과 통신할때
            //문자열 -> 기본타입[기본타입클래스명.parse~~~()]
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");
        String a = new String("aaa");
        String b = new String("aaa");
        System.out.println(a.equals(b));

        String str1 = String.valueOf(10);
        System.out.println(str1);
        String str2 = 10+"";
        System.out.println(str2);

        //변수사용범위
            //선언된 변수는 해당 중괄호 블록내에서만 사용가능, 밖에서는 사용 불가능
        int localValue = 10;
        if(true){
            localValue++;
            int localValue2 = 20;
        }
        //localValue2++;

        //p.67 콘솔로 변수값 출력
        System.out.println();
                //System 클래스: 시스템 관련된 클래스[다양한 메소드와 속성(필드) 제공]
                //out: 출력 vs in:입력
                    //1.println():출력후 줄바꿈
                    //2.print():출력
                    //3.printf():형식에 맞게 출력
        //1. print()
        System.out.print("출력 문구1");
        System.out.print("출력 문구2\n");
        //2.println
        System.out.println("출력문구1");
        System.out.println("출력문구2");
        //3.printf()
        System.out.printf("%s\n","출력문구");
        System.out.printf("%d\n" , 10);

        int valueInt = 123;
        System.out.printf("%d\n", valueInt);
        System.out.printf("%6d\n",valueInt);
        System.out.printf("%-6d\n",valueInt);
        System.out.printf("%06d\n" ,valueInt);
        double area = 3.14159 * 10* 10;
        System.out.printf("%d %10.2f\n",10,area);

        String name="홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n" ,1,name,job);
        //인텔리제이 자동완성 제공 {테스트,오류찾기용도:확인용}
            //1.sout
        System.out.println();
            //2.souf
        System.out.printf("");
            //3.soutm 현재 함수명 출력
        System.out.println("Step2.main");
            //4.soutp 현재 매개변수 출력
        System.out.println("args = " + Arrays.toString(args));
            //5.soutv : 가장 가까운 변수 
        System.out.println("job = " + job);
    }   //main e
} // class e
