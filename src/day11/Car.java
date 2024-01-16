package day11;

public class Car {

    //클래스 멤버
        //1.퍼블릭 /프리베이트 /디펄트 ,인스턴스/스태틱, 파이널,상수 필드
    private int speed; // 프리베이트 인스턴스 필드
    private boolean stop; //프리베이트 인스턴스 필드

    //2.퍼블릭/프리베이트/디펄트 생성자

    //3.퍼블릭/프리베이트/디펄트,스태틱/인스턴스 메소트\
    public static Car createCar() {
        return new Car();
    }

    public int getSpeed(){return this.speed;} //외부에 필드값 반환
    public void setSpeed(int speed){ //외부의값을 필드에 대입
        if(speed < 0){
            this.speed = 0;
        }
        else {
            this.speed = speed;
        }
    }
    public boolean isStop(){ //외부에 필드값 반환
        return this.stop;
    }
    public void setStop(boolean stop){ //외부의값을 필드에 대입
        this.stop = stop;
        if(stop == true){
            this.speed =0;
        }
    }

}
