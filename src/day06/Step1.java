package day06;

public class Step1 {
    public static void main(String[] args) {

        // p.149 : null
            //아직 참조(번지)를 저장하지 않고 있다는 뜻
        int[] intArray = null;
            // 스택에 변부생성 : intArray
//        intArray[0] = 10; // .NullPointerException
            //배열변수(스택영역)은 있지만. 배열객체(힙영역)가 실제로 존재하지 않음.
        String str = null;
//        System.out.println("str.length = " + str.length()); .NullPointerException
        //----------------------------p.151----------------------------------//
        //GC : 쓰레기 수집기
            // - 자바는 객체(힙영역)을 직접 제거하는 방법을 제공하지 않는다.
            // - 그 객체의 모든 참조를 없애서 제거 ,null
        String hobby = "여행";
            // String hobby : 스택영역에 생성된 변수
            // "여행" : 힙영역에 생성된 문자열 객체[ex 102번지]
                // = 대입 102번지를 hobby 변수에 대입
        hobby = null;
            //hobby 변수에 null을 대입
            //현재 "여행"이라는 객체는 아무도 참조하지 않기 때문에 자동으로 힙영역 삭제
        String kind1 = "자동차";
        // String kind1 : 스택영역          "자동차" [103번지]
        String kind2 = kind1;
        // String kind2 : 스택영역 kind1 [103번지]
        kind1 = null;
            //"자동차"객체는 사라지지않는다. kind2가 참조중이기 때문에
        
        String[] array1 = {"유재석", "강호동"};
        String[] array2 = new String[2];

        System.out.println("array2 = " + array2);
        System.out.println("array2[1] = " + array2[1]);
    }
    // 함수종료 -> 지역변수들 -> 지역변수 사라짐 -> 지역변수 참조한 힙영역 사라짐
    // -main()함수는 자바 진입/시작점 --> main함수 ㄲㅌ나면 힙영역도 모두 사라짐 , 
    
    // =====================배열 복습=====================//
    // 배열(객체): 연속된 공간에 값을 나열시키고 각 값에 인덱스 부여
    //1.배열의 선언: String[] array1 = {"값","값"}
    //          String[] array1 = new String[2];
    //2.배열의 항목/요소 호출
    /*
        array2[인덱스]
       3. 항목/요소 값 수정/변경
            array2[인덱스] = 새로운 값
       4. 항목/요소 삭제: 없음 [ 자바는 힙 영역을 제거하는 방법을 제공하지 않는다]
            -배열의 크기는 늘리거나 줄일 수 없다. => 방법: 1.직접 함수 만들기, 2.라이브러리(컬렉션 프레임워크)
       5. 배열의 구조
            1.스택은 배열의 0번 인덱스 주소를 참조한다
                -인덱스 마다 주소값이 다름
            String[] array1 = {"유재석","강호동"};

            스택                      힙
            String[] array1         1.배열객체 =    {"유재석","강호동"};
                                    2.문자열(유재석)객체 =      103번지
                                    3.문자열(강호동)객체 =      104번지
                                    4.따라서 배열객체 = {103번지,104번지}로 인식가능


           String[] array2 = new String[2]
           스택영역                     힙영역 new String[2]
                String[] array2         0.배열 객체 = {null,null}
                                        1.배열객체 = {201번지,null}

                1. 배열 내 특정항목 대입
                array2[0] = "유재석"     1.문자열(유재석) 객체=        201번지
     */
}
