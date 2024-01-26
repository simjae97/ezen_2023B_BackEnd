package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends SuperDao{

    private BoardDao(){}
    private static BoardDao boardDao = new BoardDao();

    public static BoardDao getInstance() {
        return boardDao;
    }
    public int boardWrite(BoardDto boardDto) {
        // 1. SQL 작성 [ 변수가 들어갈 자리에는 ?로 대체한다 ]
        try {
            String sql = " insert into board(cno, mno, btitle, bcontents) values (?, ?, ?, ?);";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setInt(1, boardDto.getCno()); // 기재된 SQL내 첫번째 ?에 값 대입
            ps.setInt(2, boardDto.getMno()); // 기재된 SQL내 2번째 ?에 값 대입
            ps.setString(3, boardDto.getBtitle()); // 기재된 SQL내 3번째 ?에 값 대입
            ps.setString(4, boardDto.getBcontents()); // 기재된 SQL내 4번째 ?에 값 대입

            // 3. SQL 실행 // 4. SQL 결과
            int count = ps.executeUpdate();//executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            if (count == 1) { // 1개가 영향을 받았다는 소리니까 혹시 0개일때를 대비해서 유효성
                return 0;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        // 5. 함수 종료
        return 1; // 실패 샘플
    }

    public ArrayList<CategoryDto> cateList(){
        ArrayList<CategoryDto> result = new ArrayList<>();
        try {
            String sql = "select * from category order by cno";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                CategoryDto categoryDto = new CategoryDto();
                categoryDto.setCno(rs.getInt("cno"));
                categoryDto.setCname(rs.getString("cname"));
                result.add(categoryDto);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
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
