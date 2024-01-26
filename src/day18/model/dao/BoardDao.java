package day18.model.dao;

import day18.model.dto.BoardDto;

public class BoardDao extends SuperDao{

    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();

    public static BoardDao getInstance() {
        return boardDao;
    }

    public BoardDto view(int num){
        try {
            String sql = "update board set bview = bview+1 where bno = ?;";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, num);
            ps.executeUpdate();
                    //1.sql작성
            sql = "select * from board where bno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                int cno = rs.getInt("cno");
                int bno = rs.getInt("bno");
                int mno = rs.getInt("mno");
                String btitle = rs.getString("btitle");
                String bcontents = rs.getString("bcontents");
                String bdate = rs.getString("bdate");
                int bview = rs.getInt("bview");
                BoardDto boardDto = new BoardDto(cno,bno,mno,btitle,bcontents,bdate,bview);
                return boardDto;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public String findId(int num){ //가져온 cno를 기준으로 멤버 테이블에서 다시
        try {
            //1.sql작성
            String sql = "select mid from member where mno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                return rs.getString("mid");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public String findCategory(int num){
        try {
            //1.sql작성
            String sql = "select cname from category where cno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            rs = ps.executeQuery();
            if(rs.next()){ //검색결과 테이블에서 다음레코드 이동 존재하면 true 없으면 false
                return rs.getString("cname");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public boolean dropBoard(int num){
        try {
            //1.sql작성
            String sql = "delete from board where bno = ?;";
            //2.sql 기재
            ps = conn.prepareStatement(sql);
            //2-1 매개변수 대입
            ps.setInt(1, num);
            //3.sql 실행 //4.sql 결과
            ps.executeUpdate();
            return true;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

}
