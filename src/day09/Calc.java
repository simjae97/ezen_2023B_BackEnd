package day09;

public class Calc {

    //클래스멤버
        //1.필드
        //2. 생성자
        //3.메소드
            //1.리턴타입
            //2.함수명
            //3.(매개변수,매개변수)
            //4.{명령문}
            //5.return
                //void : return;
                //void 아니면 : return 값;
                    //-값은 메소드선언시 리턴타입 정의한 타입과 일치
    void powerOn(){
        //1.void: 메소드를 호출한 곳으로 전달하는 결과값이 없다
        //2. "powerOn" :함수명이고 카멜표기법 권장
        //3. (): 메소드를 호출 할 때 전달할 매개값을 받기 위한 곳
        //4.{}:메소드가 실행되는 구역
        //5.return : (void일경우)생략가능
        System.out.println("전원을 켭니다");

    }
    //2.
    void powerOff(){
        System.out.println("전원을 끕니다");
    }

    //3. 매개변수: 2개, 리턴 :int
    int plus(int x, int y){
        //1.int :메솓가 호출한 곳으로 전달하는 결과 값의 타입이 int
        //2.-
        //3.(int x, int y) : 메소드를 호출할때 전달한 매개값을 받기 위한  곳
        //4.-
        //5. void를 제이한 함수 내 return 무조건 필수
        int result = x+y;
        return result;
    }

    //4. 매개변수:2개, 리턴:double;
    double divide(int x, int y){
        double result = (double) (x)/y;
        return result;
        // return:함수를 종료하는 키워드  vs break : 가장 가까운 반복문 종료
    }
}
