package day18.controller;

import day18.model.dao.MemberDao;
import day18.model.dto.MemberDto;

public class MemberController {
    private MemberController(){}
    private static MemberController memberController = new MemberController();

    public static MemberController getInstance() {
        return memberController;
    }
    public int signup(MemberDto memberDto){
        int result =0;
        //3.가공처리/ 로직
            //만약에 입력받은 아이디의 길이가 8글자 미만이면 실패
        //if(memberDto.getMid().length() <8){
            //return 3;
        //}
           // 아이디중복검사
        if (MemberDao.getInstance().idCheck(memberDto.getMid())){
            return 2;}

        // 회원가입 요청
        result = MemberDao.getInstance().signup(memberDto);
        return result;
    }
    // 로그인 상태 필드(boolean /string/int)
    int loginMno = 0;
    //2-로그인
    public boolean login(MemberDto memberDto){
        boolean result = true;//기본값
        //1.dao에게 login 처리 요청하고 결과받기
        result= MemberDao.getInstance().login(memberDto);
        //2.만약에 login 성공이면 로그인상태 변경
        if(result){
            //login성공한 회원번호 dno 요청
            loginMno = MemberDao.getInstance().findMno(memberDto.getMid());//=Dao호출;
        }
        else {

        }

        return result;
    }
    //2-2 로그아웃
    public void logout(){
        loginMno = 0;
    }

    public int getLoginMno() {
        return loginMno;
    }

    public void setLoginMno(int loginMno) {
        this.loginMno = loginMno;
    }
}
