package day22.Step3;

public class Step3 {
    public static void main(String[] args) {
        Agency<Car> carAgency = new Agency<>(Car.class);
        Car car1 = carAgency.rent();
        car1.run();

        Agency<Home> homeAgency = new Agency<>(Home.class);
        Home home1 = homeAgency.rent();
        home1.turnOnLight();

        Rentable<Car> carAgency2 = new Agency<>(Car.class);
        Car car2 = carAgency2.rent();
    }
}
