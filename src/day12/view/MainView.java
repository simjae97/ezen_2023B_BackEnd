package day12.view;

import java.util.Scanner;

// view : 화면구현(입출력)
public class MainView {

    /*
        싱글톤: 프로그램내 하나의 객체 사용 패턴
        1.생성자 프라이빗
        2.필드에 본인객체 생성
     */

    private MainView(){}
    private static MainView mainView =new MainView();

    public static MainView getInstance() {
        return mainView;
    }

    Scanner scanner = new Scanner(System.in);
    //멤버
    //1.필드
    //2.생성자
    //3.메소드
    public void run(){

        while (true){
            System.out.println("-----------메인페이지---------");
            System.out.println("1.회원가입 2.로그인 3.아이디 찾기 4.비밀번호 찾기");
            System.out.print("선택>");
            int ch =scanner.nextInt();
            if(ch==1){ //회원가입 페이지 이동
                MemberView.getInstance().signup();
            }
            else if(ch==2){
                MemberView.getInstance().login();
            }
            else if(ch ==3){
                MemberView.getInstance().findId();
            }
            else if(ch==4){
                MemberView.getInstance().findPw();
            }
        }

    }
}
