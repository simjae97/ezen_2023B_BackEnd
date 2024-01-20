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
        int money = Mainview.scanner.nextInt();
        System.out.println("1.신한은행 2.국민 3.농협");
        int ch = Mainview.scanner.nextInt();
        if (ch == 1){       //신한,국민,농협을 확인받아 원본을 그 타입인 객체로 생성 후 부모인 은행으로 형변환
            신한 신한유저 = new 신한(anum,name,money);
            은행 a = 신한유저;
//            controller.계좌생성(계좌번호,이름,입금액);
//            controller.입금(계좌번호,입금액);
//            controller.출금(계좌번호.입금액);
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
            은행 a = 국민유저;
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
            은행 a = 농협유저;
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
        int money = Mainview.scanner.nextInt();
        은행 a = new 은행();    //은행객체를 받아 넣을 입금액과 비교할 계좌번호를 인풋
        a.set입금액(money);
        a.set계좌번호(anum);
        if(anum.length() >= 2 ) { //앞서 은행 생성DTO시 계좌번호에 인식번호 두글자를 붙였으니 최소 2글자 이상일때만 유효성 검사
            String result = controller.입금(a);   //컨트롤러에 비교용 은행객체를 보내고 입금완료후 나온 총금액을 result로 받아옴
            if (result != null) {   //
                System.out.println("현재 회원님의 총 금액은" + result + "입니다.");
            } else {
                System.out.println("없는 계좌번호입니다");
            }
        }
        else {
            System.out.println("계좌번호가 잘못되었습니다");
        }
    }
    public void 출금(){ //예금이랑 똑같음
        System.out.println("계좌번호 입력");
        String anum = Mainview.scanner.next();
        System.out.println("출금액 입력");
        int money = Mainview.scanner.nextInt();
        은행 a = new 은행();
        a.set입금액(money);
        a.set계좌번호(anum);
        if(anum.length()>=2) {
            String result = controller.출금(a);
            if (result != null) {
                System.out.println("현재 회원님의 총 금액은" + result + "입니다.");
            } else {
                System.out.println("없는 계좌번호입니다");
            }
        }
        else {
            System.out.println("계좌번호가 잘못되었습니다");
        }
    }

    public void 계좌확인(){
        System.out.println("계좌번호 입력");
        String anum = Mainview.scanner.next();
        은행 a = new 은행();
        a.set계좌번호(anum);
        은행 result = controller.계좌확인(a);
        if(result != null){
            if(result instanceof 국민){ //원래 생긴게 국민이면 (앞글자 두개로 판별도 가능)
                국민 result1 = (국민) result;
                System.out.println("계좌주:"+result1.get계좌주());
                System.out.println("계좌번호 :"+result1.get계좌번호());
                System.out.println("현재 금액:"+result1.get입금액());
                System.out.println("쿠폰이벤트 참여여부:"+result1.get입금확인());
            }
            else if(result instanceof 농협){  //원래 생긴게 농협이면
                농협 result1 = (농협) result;
                System.out.println("계좌주:"+result1.get계좌주());
                System.out.println("계좌번호 :"+result1.get계좌번호());
                System.out.println("현재 금액:"+result1.get입금액());
                System.out.println("포인트 :"+result1.get포인트());
            }
            else if(result instanceof 신한){  //원래 생긴게 신한이면
                신한 result1 = (신한) result;
                System.out.println("계좌주:"+result1.get계좌주());
                System.out.println("계좌번호 :"+result1.get계좌번호());
                System.out.println("현재 금액:"+result1.get입금액());
                System.out.println("마일리지 :"+result1.get마일리지());
            }

        }

    }
}
