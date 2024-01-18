package think.model.dto;

public class 신한 extends 은행{
    public 신한(String 계좌번호, String 계좌주, String 입금액){
        this.계좌번호 = "01"+계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    String 마일리지;

    public String get마일리지() {
        return 마일리지;
    }

    public void set마일리지(String 마일리지) {
        this.마일리지 = 마일리지;
    }
}
