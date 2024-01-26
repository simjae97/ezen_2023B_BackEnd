package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;

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
                System.out.println("볼 번호 입력");
                int ch2= scanner.nextInt();
                BoardDto boardDto = BoardController.getInstance().view(ch2);
                if (boardDto != null){
                    //findId(int num): 가져온 mno를 다시 mid찾기 함수에 넣어서 String mid를 가져옴
                    //findCategory(int num) :가져온 cno를 다시 cname 찾기 함수에 넣어서 String cname 가져옴
                    System.out.println("==========ezen 게시물==============");
                    System.out.println("게시물번호"+boardDto.getBno()+"      "+"작성자:"+BoardController.getInstance().findId(boardDto.getMno())+"조회수 : "+boardDto.getBview());
                    System.out.println("카테고리 :"+BoardController.getInstance().findCategory(boardDto.getCno())+" 제목 :"+boardDto.getBtitle());
                    System.out.println("내용 :"+boardDto.getBcontents());
                    System.out.println("------------------------------------");
                    System.out.println("1.뒤로가기 2.수정 3.삭제 4.댓글쓰기");
                    System.out.println("선택>");
                    int ch3 = scanner.nextInt();
                    if(ch3==1){}
                    else if(ch3==2){
                        if(boardDto.getMno() == MemberController.getInstance().getLoginMno()){
                            System.out.println("수정함수 실행");
                        }
                        else{
                            System.out.println("수정 권한이 없습니다.");
                        }
                    }
                    else if(ch3==3){
                        if(boardDto.getMno() == MemberController.getInstance().getLoginMno()){
                            System.out.println("삭제함수 실행");
                            BoardController.getInstance().dropBoard(boardDto.getBno());
                        }
                        else{
                            System.out.println("삭제 권한이 없습니다.");
                        }
                    }
                    else if(ch3==4){
                        System.out.println("현재 구현되지 않은 기능입니다");
                    }
                    else{
                        System.out.println("잘못된 접근입니다");
                    }

                }
                else {
                    System.out.println("없는 번호입니다");
                }
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
