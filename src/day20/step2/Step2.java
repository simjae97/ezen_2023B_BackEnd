package day20.step2;

public class Step2 {
    public static void main(String[] args) {
        RemoteControl2 remoteControl2 = new SmartTv();
        remoteControl2.turnOn();
        remoteControl2.turnOff();

        Searchable rc2 = new SmartTv();
        rc2.search("dd");
        rc2.turnOn();

        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();
        smartTv.turnOff();
        smartTv.search("dd");
    }
}