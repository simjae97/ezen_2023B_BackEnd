package day01;

public class Step3 {
    public static void main(String[] args) {
        int var1 = 0b1111;
        System.out.println("var1: "+var1);
        int var2 = 0206;
        System.out.println("var2: "+var2);
        int var3 = 365;
        System.out.println("var3: "+var3);
        int var4 = 0xB3;
        System.out.println("var4: "+var4);

        byte b1 = -128;
        System.out.println("b1: "+b1);
        byte b2 = 127;
        System.out.println("b2: "+b2);
//        byte b3 = 200;
//        System.out.println("b3 "+b3); incompatible types: possible lossy conversion from int to byte
        //short [-32768 ~ 32767]

        short s1 = 32000;
        System.out.println("s1: "+s1);
//        short s2= -50000;
//        System.out.println("s2: "+s2 );java: incompatible types: possible lossy conversion from int to short

        //int[+- 21억] : 4바이트-> 정수타입 리터럴(그 값 자체)
        int i1 = 2000000000;
        System.out.println(i1);
//        int i2 = 5000000000;
//        System.out.println(i2) java: integer number too large;
        //long[+-21억 이상] -> 정수타입 리터럴(int)보다 범위가 넓으므로 뒤에 l을 붙여 리터럴을 바꿈

        long l1 = 20000000000l;
        System.out.println(l1);

        //char[0~65535]: 2byte ''작은따옴표 사용 부호있음[signed]/부호없음[unsigned]
        char c1 = 'a';
        System.out.println(c1);
        char c2 = 97;
        System.out.println(c2);
        char c3 = '가';
        System.out.println(c3);
//        char c4 = "가";
        int c4 = 'a';
        System.out.println(c4);
        int c5 ='가';
        System.out.println(c5);

        char c6 = 80;
        System.out.println(c6);

        //String 문자열[] ="" 큰따옴표, 참조자료형(클래스)

        String str1 = "안녕하세요";
        System.out.println("str1 : "+str1);
        String str2 = "나는 \"자바\"를 배웁니다";
        System.out.println(str2);
        String str3 = "번호\t이름\t직업";
        System.out.println(str3);
        String str4 = """
                나는 자바를
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str4);

        //float 소수점 8자리 표현: 4바이트:반올림
        float f1 = 1.23456789012345F;
        System.out.println(f1);
        //double 소수점 17자리 표현: 8바이트: 실수타입의 기본타입
        double d1 = 12.34567890123456;
        System.out.println(d1);
        System.out.println(1.1+0.1);
        //boolean: 1byte
        boolean bool1 = true;
//        boolean bool2 = 1; 자동 타입변환 X 1(int)이므로 boolean에 저장할수없다

    }
}
