package day12.controller;

import day12.model.MemberDao;
import day12.model.MemberDto;

// CONTROLLER : VIEW와 DAO 중계역할
public class MemberController {
    //싱글톤
    private MemberController(){}
    private static MemberController memberController = new MemberController();

    public static MemberController getInstance() {
        return memberController;
    }

    //1.회원가입 controller 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberController.signup");

        //1. 유효성 검사 처리
        //2.view 받은 객체를 DAO에게 전달 후 처리 결과를 받기
        boolean result = MemberDao.getInstance().signup(memberDto);
        return result;
    }

    //+로그인 했다는 증거. - 로그아웃을 하기 전까지.[회원번호 또는 아이디]
    String loginSession = null; // null이면 비로그인 null 대신에 아이디가 있으면 로그인된 상태
    //2.로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[2]MemberController.login");

        boolean result = MemberDao.getInstance().login(memberDto);
        System.out.println("[4]MemberController.login");
        System.out.println("result = " + result);
        //만약에 로그인 성공시 로그인 상태 변경
        if (result){
            //로그인 상태 필드에 로그인 성공한 아이디를 대입
            loginSession = memberDto.getId();
        }
        return result;
    }

    public String findId(MemberDto memberDto){

        return MemberDao.getInstance().findId(memberDto);
    }

    public String findPw(MemberDto memberDto){
        return MemberDao.getInstance().findPw(memberDto);
    }
}
