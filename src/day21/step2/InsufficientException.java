package day21.step2;

public class InsufficientException extends Exception{
    //1.Exception 클래스로부터 상속을 받는다
    // 2.
    public InsufficientException(){}
    public InsufficientException(String message){
        super(message); // super : 상위 객체 vs this : 본인 객체
    }

    /*
                    super  vs           this
       필드           X               this.필드명
       생성자        super()               X
       메소드        super.메소드명()       X
     */
}
