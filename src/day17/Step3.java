package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            //DB연동
            //1. JDBC 드라이버 로딩한다
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. db 서버와 연동
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test5", "root", "1234");
            System.out.println("연동성공");
        }
        catch (Exception e){
            System.out.println(e);
        }
        while (true){
            System.out.println("고객명단 : 1.삽입 2.출력 3.수정 4.삭제");
            try{
                int ch = scanner.nextInt();
                if(ch==1){
                    //1.입력받기
                    System.out.println("고객이름"); String name = scanner.next();
                    //2
                    String sql = "insert into members values('"+name+"');";
                    preparedStatement = connection.prepareStatement("insert into members(name) values(?);");
                    preparedStatement.setString(1,name);
                    preparedStatement.executeUpdate();

                    //connection.prepareStatement("insert into members values('"+name+"');").executeUpdate();
                }
                else if(ch==2){
                    String sql = "select * from members";
                    ResultSet resultSet = connection.prepareStatement(sql).executeQuery();
                    //System.out.println(resultSet); // select 결과를 가지고 있는 인터페이스
                    //resultSet.next(); // next : select 결과 테이블에서 다음 레코드로 이동후 존재여부를 true/false로 반환하는 함수
                    while(resultSet.next()){
                        //하나씩 next로 레코드를 이동하면서 반복처리하다가 만약에 다음 레코드가 존재하지않으면 반복종료
                        System.out.print(resultSet.getString("mno"));
                        System.out.println(resultSet.getString("name"));
                    }
                }
                else if(ch==3){
                    System.out.println("수정할 고객명 : "); String oldName = scanner.next();
                    System.out.println("새로운 고객명 :"); String newName = scanner.next();
                    String sql = "update members set name = '"+newName+"' where name = '"+oldName+"'";
                    System.out.println(sql);
                    connection.prepareStatement(sql).executeUpdate();
                }
                else if(ch==4){
                    System.out.println("삭제할 고객명 :"); String name = scanner.next();
                    preparedStatement = connection.prepareStatement("delete from members where name= (?);");
                    preparedStatement.setString(1,name);
                    preparedStatement.executeUpdate();
                }
                else{
                    System.out.println("잘못된 번호");
                }
            }
            catch (Exception e){
                scanner.nextLine();
                System.out.println(e);
                //scanner = new Scanner(System.in);
            }
        }
    }
}
