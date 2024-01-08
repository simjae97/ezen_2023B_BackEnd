package day05;

public class Step2 {
    public static void main(String[] args) {
        //165p.배열 타입
        /*

            1.배열: 연속된 공간에 값을 나열하고 각 값에 인덱스 부여
                인덱스: 각 항목의 값을 ㅎ호출하거나 저장하는데 사용됨
            2.특징
                1.배열은 같은 타입의 값만 저장

                2.배열의 길이는 선언된 이후 늘리거나 줄일 수 없음
           3.선언
                배열선언 : 자료형[] 변수명;
           4.값 목록으로 배열 선언
                -배열 생성 : 타입[] 변수명 = {값0,값1,값2,값3};
                -배열에 넣을 초기값을 알고 있을때 사용
                -배열 생성2 : 타입[] 변수명 = new 타입[길이]
                -배열에 넣을 초기값을 모르고 배열의 길이를 알고있을때 사용
                -초기값 : 정수 0 , 실수 0.0 , 논리 false, 클래스(String)/인터페이스 null

           5.배열의 길이를 구하는 속성명
                -배열명.length;
           6.배열 학목/요소 값 넣기
                -배열명[인덱스] = 새로운값;
           7.배열 항목/요소 값 호출
                -배열명[인덱스]
           8.배열 항목/요소 값 수정
                -배열명[인덱스] = 새로운 값;
           9.배열 항목/요소 값 삭제.[항목/요소 위치 삭제는 없고 초기화한다.]
                -배열명[인덱스]= 각 타입의 초기값
         */
        //1.배열 생성/선언 : 여러개 문자열을 저장하는 배열 선언.
        String[] season = {"spring" , "summer", "fail" , "winter"};
        //인덱스           : 0         ,1      ,2      ,3
        System.out.println("season :"+season); //heap메모리의 주소값 출력
        System.out.println("season[0] : "+season[0]);
        System.out.println("season[1] : "+season[1]);
        System.out.println("season[2] : "+season[2]);
        System.out.println("season[3] : "+season[3]);
        //System.out.println("season[4] : "+season[4]); 인덱스가 3까지밖에 없어서 오류

        for(int i = 0; i < season.length; i++){
            System.out.println("season["+i+"] : "+season[i] );
        }
        season[1] = "여름";
        System.out.println("season[1] : "+season[1]);
        //int형 여러개 데이터를 선언하는 배열 선언
        int[] scores = {83, 90,87};
        int sum = 0;
        for (int i = 0; i<3; i++){
            sum += scores[i];
        }
        System.out.println("sum = "+sum);
        System.out.println("avg = "+(double)(sum)/ scores.length);


        //173.p: new 연산자를 이용한 배열 선언
        int[] arr1 = new int[3]; // 타입[]변수명 = new 타입[길이];
        //2. for 이용한 배열내 모든 요소 호출
        for( int i : arr1){
            System.out.printf("%2d\n", i);
        }
        for (int i = 0; i< arr1.length; i++){
            arr1[i] = 10*(i+1);
        }
        for( int i : arr1){
            System.out.printf("%2d\n", i);
        }

        double[] arr2 = new double[3];

        for (double i : arr2){
            System.out.printf("%2f\n",i);
        }
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (double i : arr2){
            System.out.printf("%2f\n",i);
        }
        String[] arr3 = new String[3];
        for (String i : arr3){
            System.out.printf("%2s \n" ,i);
        }
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for (String i : arr3){
            System.out.printf("%2s \n" ,i);
        }
    }
}
