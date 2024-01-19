package think.model.dto;

public class 국민 extends 은행{
    public 국민(String 계좌번호,String  계좌주,int 입금액){
        this.계좌번호 = "02"+계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    boolean 입금확인;

    public boolean get입금확인() {
        return 입금확인;
    }

    public void set마일리지(boolean 입금확인) {
        this.입금확인 = 입금확인;
    }
}