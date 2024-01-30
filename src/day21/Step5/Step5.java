package day21.Step5;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {
        Button button = new Button();
        //2.(우리가만든) 추상버튼 메소드 정의
        button.setClickLister(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("ok버튼을 클릭했습니다");
            }
        });
    }

    // 만약 익명 구현체가 없을때
        //1.구현클래스가 필요
}
