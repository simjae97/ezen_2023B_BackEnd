package day11;

public class Step2 {
    public static void main(String[] args) {
        Car mycar = Car.createCar();

        mycar.setSpeed(-50);
        System.out.println(mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println(mycar.getSpeed());

        if(!mycar.isStop()){
            mycar.setStop(true);
        }
        System.out.println(mycar.getSpeed());
    }
}
