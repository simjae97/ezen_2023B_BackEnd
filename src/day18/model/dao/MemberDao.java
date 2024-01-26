package day18.model.dao;


import day18.model.dto.MemberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDao extends SuperDao{
    //인터페이스 준비물 상속

    private static MemberDao memberDao = new MemberDao();

    public static MemberDao getInstance() {
        return memberDao;
    }
    //1.회원가입
    public int signup(MemberDto memberDto){
        try {
            //1.sql작성
            String sql = "insert into member( mid,mpw,mphone) values(?,?,?);";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setString(1, memberDto.getMid());
            ps.setString(2, memberDto.getMpw());
            ps.setString(3, memberDto.getMphone());
            //3.sql 실행 //4.sql 결과
            int count = ps.executeUpdate(); // 기재된 sql실행하고 insert된 레코드 개수반환
            if (count == 1) {
                return 0;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        //5.sql종료
        return 1;
    }
    //2.아이디 검사용(아이디 중복검사 필드)
    public boolean idCheck(String mid){
        try {


            //1.sql 작성
            String sql = "select mid from member where mid = ? ;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            ps.setString(1,mid);
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                return true;
            }
            else{
                return false;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return true;
    }
    public boolean login(MemberDto memberDto){
        try {
            //1.sql 작성
            String sql = "select * from member where mid = ? and mpw = ? ; ";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            // 매개변수대입
            ps.setString(1,memberDto.getMid());
            ps.setString(2,memberDto.getMpw());
            //3.sql 실행
            //4.sql결과처리
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            //5.함수종료
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }
    //아이디를 이용한 회원번호 찾기
    public int findMno(String mid){
        try {


            //1.sql 작성
            String sql = "select mno from member where mid = ?";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            // 매개변수 대입
            ps.setString(1, mid);
            //3.sql 실행
            rs = ps.executeQuery();
            //4.sql 결과처리
            if (rs.next()) {
                //rs.get타입(호출할필드번호or필드이름)
                return rs.getInt("mno");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        //5.함수종료
        return 0;
    }
}
