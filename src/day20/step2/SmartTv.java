package day20.step2;

public class SmartTv implements RemoteControl2,Searchable{
    @Override
    public void turnOn() {
        System.out.println("tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"를 검색합니다");
    }
}
