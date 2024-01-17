package day12;

import day12.view.MainView;
import day12.view.MemberView;

//실행클래스:
public class Application {
    public static void main(String[] args) {
        //다른클래스의 메소드를 호출하는 방법
        //1.해당 메소드가 인스턴스 메소드 일 경우
//        new MainView().run();
//        //2.해당 메소드가 인스턴스 메소드일 경우
//        MainView mainView = new MainView();
//        mainView.run();
        //3.해당 메소드가 정적 메소드인 경우
        //MainView.run();
        // 4.싱글톤.
        MainView.getInstance().run();
    }
}


/*
    소프트웨어 개발시 사용되는 디자인 패턴 MVC
        MVC: 사용자 인터페이스, 데이터 및 논리제어를 구현하는데 있어 사용되는 패턴
        -관심사 분리해서 업무의 분리와 향상된 관리
        M: MODEL    :JAVA,DB        :데이터 객체
            DAO(Data Access Object): 데이터 접근객체->DB접근객체
            DTO객체(Data Transfer Object): 서로 다른 레이어/계층에 이동하는 객체
            VO(Value Object): 불변 데이터 객체/수정금지(setter 없음)
        V :VIEW     :HTML,CSS,JS    :입출력 화면 구현
        C:CONTROL   :JAVA           :MODEL 과 VIEW의 중계역할하고 제어
            controller : 제어역할, 유효성 검사
            service    : 비즈니스로직 (중요기능 로직)


        사용자(VIEW) ---DTO JSON--> CONTROLLER ----DTO-->DAO------------> DATABASE

        ex)식당
        고객-------요리요청----->서빙직원-----요리요청전달------>요리사----재료--->냉장고
              <----음식----------     <----음식결과 -------   요리 <-----------
 */