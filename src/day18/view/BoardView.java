package day18.view;

import day18.controller.MemberController;

import java.util.Scanner;

public class BoardView {
    private BoardView(){}
    private static BoardView boardView =new BoardView();

    public static BoardView getInstance() {
        return boardView;
    }

    Scanner scanner = MainView.getInstance().scanner;

    //0.로그인 성공시 출력되는 화면
    public void run(){
        while (true){
            System.out.println("=================게시판=================");
            // 추후에 현재 게시물 출력 메소드가 들어갈 자리
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");
            System.out.print("입력>");int ch= scanner.nextInt();
            if(ch==1){
            }
            else if (ch==2){

            }
            else if(ch==3){
                MemberController.getInstance().logout();
                return;
            }
            else{
                System.out.println("잘못된 접근입니다");
            }
        }
    }
}
