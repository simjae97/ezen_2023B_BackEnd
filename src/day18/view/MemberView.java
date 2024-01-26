package day18.view;

import day18.controller.MemberController;
import day18.model.dto.MemberDto;

public class MemberView {

    private MemberView() {
    }

    private static MemberView memberView = new MemberView();

    public static MemberView getInstance() {
        return memberView;
    }

    public void signup() {
        System.out.print("아이디 :");
        String id = MainView.getInstance().scanner.next();
        System.out.print("비밀번호 :");
        String pw = MainView.getInstance().scanner.next();
        System.out.print("전화번호 :");
        String phone = MainView.getInstance().scanner.next();
        //2.객체화
        MemberDto memberDto = new MemberDto(id, pw, phone);
        int result = MemberController.getInstance().signup(memberDto); // 0 : 성공 1:db오류 2:중복 3: 유효성검사 실패
        //4.
        if (result == 0) {
            System.out.println("회원가입성공");
        }
        else if(result == 1){
            System.out.println("시스템 내부 오류 관리자에게 문의");
        }
        else if(result == 2 ){
            System.out.println("사용중인 아이디입니다.");
        }
        //생략
    }
    public void login(){
        //1.입력
        System.out.println("아이디: "); String id =MainView.getInstance().scanner.next();
        System.out.println("비밀번호 "); String pw = MainView.getInstance().scanner.next();
        //2.객체화
        MemberDto memberDto = new MemberDto();
        memberDto.setMid(id); memberDto.setMpw(pw);
        //3.전달후 결과
        boolean result = MemberController.getInstance().login(memberDto); //컨트롤러 메소드를 호출하는 자리
        //4.결과 출력
        if(result){
            System.out.println("로그인성공");
            //페이지전환
            BoardView.getInstance().run();
            System.out.println("보드뷰 끝남");
        }
        else {
            System.out.println("로그인 실패");
        }

        //3.전달후 결과

        //4.결과 출력
    }
}
