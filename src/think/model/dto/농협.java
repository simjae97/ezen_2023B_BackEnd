package think.model.dto;

public class 농협 extends 은행{
    농협(String 계좌번호,String  계좌주,String 입금액){
        this.계좌번호 = "03"+계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    boolean 포인트;

    public boolean get포인트() {
        return 포인트;
    }

    public void set포인트(boolean 포인트) {
        this.포인트 = 포인트;
    }
}