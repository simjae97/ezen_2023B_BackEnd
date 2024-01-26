package day18;

import day18.view.MainView;

public class Application {
    public static void main(String[] args) {
        //1MainView mainView = new MainView();
        //mainView.run();

        //2.new MainView().run();
        //3.싱글톤
        MainView.getInstance().run();


        //4.static일시
        //MainView.run();

    }
}

/*

    -다른 클래스내 메소드를 호출하는 방법

 */