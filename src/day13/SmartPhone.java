package day13;

public class SmartPhone extends Phone{
    //1.필드
    public boolean wifi;
    //2.생성자
    public SmartPhone(String model, String color){
        this.model = model;
        this.color  = color;
    }

    //3.메소드
    public void setWifi(boolean wifi){
        this.wifi = wifi;
        System.out.println("와이파이 상태 변경 ");
    }
    public void internet(){
        System.out.println("인터넷 연결");
    }
}
