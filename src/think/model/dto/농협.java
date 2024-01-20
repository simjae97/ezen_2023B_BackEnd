package think.model.dto;

public class 농협 extends 은행{
    public 농협(String 계좌번호,String  계좌주,int 입금액){
        this.계좌번호 = "03"+계좌번호; //입력받은 계좌번호에 식별용 번호 03입력
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    double 포인트;

    public double  get포인트() {
        return 포인트;
    }

    public void set포인트(double  포인트) {
        this.포인트 = 포인트;
    }
}