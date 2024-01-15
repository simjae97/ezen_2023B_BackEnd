package day10;

public class Car {
    //멤버
    //1.필드
    int gas;
    //2.생성자
    //3.메소드
    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if(this.gas ==0){
            System.out.println("가스가 없습니다");
            return false;
        }
        else{
            System.out.println("가스가 있습니다");
            return true;
        }
    }
    void run(){
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas잔량:" + this.gas + ")");
                this.gas -= 1;
            } else {
                System.out.println("멈춥니다. (gas잔량:" + this.gas + ")");
                System.out.println("가스를 주입하세요");
                return;
            }
        }
    }
}
