package day02;

public class Step1 { //자바의 모든 클래스는 클래스 안에서 작성
    public static void main(String[] args) {
        System.out.println("hello JAVA");
        //실행
        /*
            src 폴더 내 Step1 클래스 파일 생성[.java]
                실행/컴파일
            자동으로 out 폴더 내 Step1 클래스 파일 생성[.class]

        */
        //자동 타입 변환
            //1. 작은타입 허용범위가 큰 타입 허용범위 내 대입할때
            //byte< short,char < int < long < float< double
            //큰타입 = 작은타입
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : "+intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("intValue : "+intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : "+longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : "+floatValue);

        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue : "+doubleValue);

        //강제 타입 변환 = 캐스팅=상속=다형성
            //1. 큰타입 허용범위가 작은 타입 허용범위 내 대입할때
            //byte> short,char > int > long > float > double
            //2. 데이터 손실
                //작은타입= (작은 타입) 큰 타입
        int var1 = 10;
        byte var2 = (byte) var1;
        long var3 = 300;

        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;

        System.out.println(var6);

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);

        int result = (int) (30000*0.1);
        System.out.println(result);
        //연산식에서 자동 타입변화
            //1. byte,short 연산시 결과 타입이 int
            //2.int, int-> int
            //3.long, int->long
            //4.float,float -> float
            //5.double,float => double
        byte result1 = 10+20; //컴파일 연산
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1+v2;

        byte v3 = 10; int v4 = 100; long v5 = 1000L;
        long result3 = v3+v4+v5;

        char v6 = 'a'; char v7 = 1;
        int result4 = v6+v7;

        int v8= 10;
        int result5 = v8/10;
        int v9 = 10;
        double result6 = v9/4.0;
        int v10 = 1;
        int v11 = 2;
        double result7 =(double) v10/v11;
        System.out.println(result7);
    }
}
/*

    타입
        종류:
            1.기본 타입: 저장하는 데이터의 형식: 리터럴 데이터
                        8가지 기본적으로 제공하는 타입
                논리    정수     실수   문자
       1         boolean byte
       2                short        char
       4                int     float
       8                long    double
       리터럴            int     double
            2.참조타입: 저장하는 데이터의 형식: 메모리 주소값
                        기본 타입 외의 타입


 */
