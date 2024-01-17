package day12.view;


import day12.controller.MemberController;
import day12.model.MemberDto;
import 과제.과제5.Member;

import java.util.Scanner;

// view : 화면구현(입출력)
public class MemberView {
    //싱글톤
    private MemberView(){}
    private static MemberView memberView= new MemberView();

    public static MemberView getInstance() {
        return memberView;
    }

    //회원가입 view 메소드
    public void signup(){
        System.out.println("MemberView.signup");
        Scanner scanner = MainView.getInstance().scanner;
        //1.입력
        System.out.print("아이디:"); String id = scanner.next();
        System.out.print("비밀번호:"); String pw = scanner.next();
        System.out.print("이름:"); String name = scanner.next();
        System.out.print("전화번호:"); String phone = scanner.next();
        //2.객체화
        MemberDto memberDto =new MemberDto(0,id,pw,name,phone);

        boolean result = MemberController.getInstance().signup(memberDto);
        //3.객체를 컼ㄴ트롤에게 전달후 처리결과를 리턴으로 받기
            //처리결과(리턴/회원가입 처리결과 -(경우의수따라서 다를수있음)boolean)을 받기
        //4.결과에 따른 출력문 만들기
        if(result){
            System.out.println("회원가입 성공");
        }
        else {
            System.out.println("회원가입 실패");
        }
    }

    //2.로그인 메소드
    public void login(){
        //1.입력받기
        System.out.println("[1]MemberView.login");
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("아이디 : "); String id =scanner.next();
        System.out.print("비밀번호 :"); String pw =scanner.next();

        //2.객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPw(pw);

        //3. 컨트롤에게 전달하고 결과 받기
        boolean result = MemberController.getInstance().login(memberDto);
        System.out.println("[5]MemberView.login");
        System.out.println("result = " + result);
        if(result){
            System.out.println("로그인성공");
            //로그인 성공시 사용할 서비스의 view로 이동
        }
        else{
            System.out.println("로그인실패");

        }
    }

    public void findId(){
        System.out.println("MemberView.findId");
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("전화번호 : "); String phone =scanner.next();
        System.out.print("이름 : "); String name = scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setPhone(phone); memberDto.setName(name);
        String result = MemberController.getInstance().findId(memberDto);
        if(result == null){
            System.out.println("회원님의 아이디가 존재하지 않습니다");
        }
        else {
            System.out.println(name+"회원님의 아이디는"+MemberController.getInstance().findId(memberDto)+"입니다");
        }

    }

    public void findPw(){
        Scanner scanner = MainView.getInstance().scanner;
        System.out.print("아이디 : "); String id =scanner.next();
        System.out.print("전화번호 :"); String phone =scanner.next();
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id); memberDto.setPhone(phone);
        String result = MemberController.getInstance().findPw(memberDto);

        if(result == null){
            System.out.println("회원님의 아이디가 존재하지 않습니다");
        }
        else {
            System.out.println("회원님의 임시 비밀번호는"+MemberController.getInstance().findPw(memberDto)+"입니다");
        }
    }

}

