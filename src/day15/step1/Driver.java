package day15.step1;

public class Driver{
    public void drive(Vehicle vehicle){
        vehicle.run();


        Bus bus2 = new Bus();
        System.out.println(bus2 instanceof Vehicle);
    }
}
