package day13;

public class Step1 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "은색");
        System.out.println(smartPhone.model);
        System.out.println(smartPhone.color);
        System.out.println(smartPhone.wifi);

        smartPhone.bell();
        smartPhone.sendVoice("여보세요");
        smartPhone.receiveVoice("안녕하세요 저는 홍길동인데요");
        smartPhone.sendVoice("아~ 네 반갑습니다");
        smartPhone.hangUp();
        smartPhone.setWifi(true);
        smartPhone.internet();
    }
}
