package think.view;

import think.model.dto.신한;

public class Subview {
    //타입형변환 사용하기
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
        }
    }
}
