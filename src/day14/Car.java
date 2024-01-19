package day14;

public class Car {
    //한국 타이어타입+하위객체
    //HankookTire hankookTire ;
    //2.금호타이어타입+하위객체
    //KumhoTire kumhoTire;
    //3.타이어타입+ 하위객체(한국+금호)
    Tire tire;
    // 4.객체+자바의 모든 객체
    //Object object;
    public void run(){
        tire.roll();
    }
}
