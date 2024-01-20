package think.model.dto;

public class 신한 extends 은행{
    public 신한(String 계좌번호, String 계좌주, int 입금액){
        this.계좌번호 = "01"+계좌번호; //입력받은 계좌번호에 식별번호 01을 입력
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    double 마일리지;

    public double get마일리지() {
        return 마일리지;
    }

    public void set마일리지(double 마일리지) {
        this.마일리지 = 마일리지;
    }
}
