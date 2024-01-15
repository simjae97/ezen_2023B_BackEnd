package day10;

public class Account { //객체 설계 클래스

    //클래스멤버
    //1.필드
    String 계좌번호;
    String 계좌주;
    int 임급액;
    //2.생성자
    Account(){

    }
    Account(String 계좌번호,String 계좌주, int 입금액){
        this.계좌번호 =계좌번호;
        this.계좌주 = 계좌주;
        this.임급액= 입금액;
    }
    //3.메소드
    int get임급액(){
        return this.임급액;
    }
}
