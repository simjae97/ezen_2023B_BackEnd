package day13;

public class Step2 {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();

        Computer computer = new Computer();

        System.out.println(computer.areaCircle(3));
        System.out.println(calculator.areaCircle(3));
    }
}
