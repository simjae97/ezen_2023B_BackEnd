package day17;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step1 {

    public static void main(String[] args) {
//        try {
//
//
//            //1. Class.forName() :현재 프로젝트 내 클래스 찾기 함수
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            //mysql회사 driver 클래스를 찾기// com 폴더 내 mysql폴더내 cj폴더내 jdbc폴더내
//            //해당 폴더내 driver클래스를 찾는 과정에서 오류가 발생할 수도있다
//            //-Class Not Founde Exception:클래스를 찾지 못했다는 뜻
//            //2. connetcion : db연동 인터페이스
//            //인터페이스의 타입으로 변수 선언
////        Connection connection;
//            // 인터페이스는 스스로 객체를 만들수 없다 [추상]
//            //구현체 필수
//            //DriverManager.getConnection("DB서버주소/DB명","계정명","비밀번호명");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
//            System.out.println("시스템오류: DB서버와 연동 성공했습니다");
//        }
//        catch (Exception e){
//            System.out.println("ㅇㅇ");
//        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println("시스템오류: 드라이버가 없습니다"+e);
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
            System.out.println("연동 성공");
        }
        catch (SQLException e){
            System.out.println("서버와의 연동 실패"+e);
        }
    }

}

/*
    예외/오류 처리: 1일반 예외 2.실행예외
        - 예외/오류가 발생했을때 대처하기 위해
        1.일반 예외: 컴파일시 예외가 발생
            - 주로 자바 외부와 통신하는 클래스들(키보드,db서버,파일처리)
            -1.Scanner 클래스
            -2.DAO: 주로 데이터베이스 연동객체
        2.실행예외 : 실행중에 발생한 예외/오류
            NullPointerException
            -미리 대처하기 힘듬:미리 예외/오류를 알고있는 상태: 경험을 통한 대처


   예외/오류 처리
        -만약에 예외가 발생할것 같은 코드에 처리
        -문법
            try{} catch(예외클래스명 변수){}
 */