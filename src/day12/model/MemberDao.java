package day12.model;

import day12.view.MemberView;

import java.util.ArrayList;
import java.util.Random;

//DAO: 데이터베이스 접근 객체
public class MemberDao {
    //싱글톤
    private MemberDao(){}
    private static MemberDao memberDao= new MemberDao();

    public static MemberDao getInstance() {
        return memberDao;
    }

    //DB대신 배열
    //0.idcheck 중복아이디 체크 다시빼서 만들기
    ArrayList<MemberDto> memberDtos = new ArrayList<>();
    //1.회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberDao.signup");
            //추후에는 sql 처리
        //1.비즈니스 로직
        for (MemberDto i : memberDtos){
            if (i.getId().equals(memberDto.getId())){
                System.out.println("중복된아이디 입니다!");
                return false;
            }
        }

        memberDtos.add(memberDto);
        for (MemberDto i : memberDtos){
            System.out.println(i.getId());
        }
        return true;
    }

    //2.로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[3]MemberDao.login");
        for (int i =0; i<memberDtos.size(); i++){
            if(memberDtos.get(i).getId().equals(memberDto.getId()) && memberDtos.get(i).getPw().equals(memberDto.getPw())){
                System.out.println("로그인 성공");
                return true;
            }
        }
        System.out.println("로그인 실패 ");
        return false;
    }

    public String findId(MemberDto memberDto){
        for(MemberDto i: memberDtos){
            if(i.getPhone().equals(memberDto.getPhone()) && i.getName().equals(memberDto.getName())){
                return i.getName();
            }
        }
        return null;
    }

    public String findPw(MemberDto memberDto){
        for(MemberDto i : memberDtos){
            if(i.getId().equals(memberDto.getId()) && i.getPhone().equals(memberDto.getPhone())){
                String newPw = RandomEng.random();
                i.setPw(newPw);
                return i.getPw();
            }
        }
        return null;
    }
}
