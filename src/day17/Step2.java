package day17;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Step2 {
    public static void main(String[] args) {
        try {


            //1.DB 연동
            //1.mysql 드라이버를 메모리(드라이버객체등록에 로딩한다.
            //2.예외처리 필수: try{}catch(예외클래스명 매개변수){}
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2. 위에서 등록된 드라이버 객체를 이용한 db연동 , (서버주소,계정,비밀번호)
            //*예외처리 필수 : try{}catch(예외클래스명 매개변수){}
            //* 연동 성공시 반환 객체 : Connection 객체(statement) 구현객체 생성,트랜잭션 처리, DB연결 끊을때 사용
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
            // [C]
            connection.prepareStatement("insert into table1 values(1,'유재석')").executeUpdate();
            // [R]
            // [U]
            connection.prepareStatement("update table1 set 데이터필드2 = '강호동'").executeUpdate();
            // [D]
            connection.prepareStatement("truncate table table1").executeUpdate();
            System.out.println("db연동 성공");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
