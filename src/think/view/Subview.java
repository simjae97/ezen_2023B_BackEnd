package think.view;

import day13.step4.pac2.C;
import think.controller.Controller;
import think.model.dto.*;

public class Subview {
    //타입형변환 사용하기
    Controller controller = new Controller();
    public void 계좌생성(){
        System.out.println("계좌번호 입력");
        String anum = Mainview.scanner.next();
        System.out.println("이름 입력");
        String name = Mainview.scanner.next();
        System.out.println("입금액 입력");
        String money = Mainview.scanner.next();
        System.out.println("1.신한은행 2.국민 3.농협");
        int ch = Mainview.scanner.nextInt();
        if (ch == 1){
            신한 신한유저 = new 신한(anum,name,money);
            은행 a = (은행) 신한유저;
            boolean result = controller.계좌생성(a);
            if(result){
                System.out.println("회원가입 성공");
                System.out.println("회원님의 계좌번호는 01"+anum+"입니다.");
            }
            else {
                System.out.println("회원가입 실패");
            }
        }
        else if(ch == 2){
            국민 국민유저 = new 국민(anum,name,money);
            은행 a = (은행) 국민유저;
            boolean result = controller.계좌생성(a);
            if(result){
                System.out.println("회원가입 성공");
                System.out.println("회원님의 계좌번호는 02"+anum+"입니다.");
            }
            else {
                System.out.println("회원가입 실패");
            }
        }
        else if(ch == 3){
            농협 농협유저 = new 농협(anum,name,money);
            은행 a = (은행) 농협유저;
            boolean result = controller.계좌생성(a);
            if(result){
                System.out.println("회원가입 성공");
                System.out.println("회원님의 계좌번호는 03"+anum+"입니다.");
            }
            else {
                System.out.println("회원가입 실패");
            }
        }
    }
    public void 예금(){
        System.out.println("계좌번호 입력");
        String anum = Mainview.scanner.next();
        System.out.println("입금액 입력");
        String money = Mainview.scanner.next();
        은행 a = new 은행();
        a.set입금액(money);
        a.set계좌번호(anum);
        String result = controller.입금(a);
    }
}
