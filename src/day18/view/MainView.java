package day18.view;

import day18.controller.MemberController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {

    Scanner scanner = new Scanner(System.in);
    private static MainView mainView = new MainView();


    private MainView(){
    }
    public static MainView getInstance() {
        return mainView;
    }
    public void run(){
//        while (MemberController.getInstance().getLoginMno() != 0){
//
//        }
        while (true){
            System.out.println("1.회원가입 2.로그인");
            try {
                int ch = scanner.nextInt();
                if (ch == 1){
                    MemberView.getInstance().signup();
                }
                else if (ch==2){
                    MemberView.getInstance().login();
                }
                else{
                    System.out.println("알수없는 번호입니다");
                }
            }
            catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println(e);
            }
            catch (Exception e){
                scanner.nextLine();
                System.out.println(e);
            }
        }
    }

}
