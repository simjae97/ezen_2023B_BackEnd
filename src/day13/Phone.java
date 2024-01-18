package day13;

public class Phone {
    //멤버
    //접근 제한자(public/private/protect/default) (static/인스턴스) (final/notfinal) 필드
    public String model;
    public String color;

    //2. 접근제한자(public/private/protect/default) 생성자

    //3. 접근제한자(public/private/protect/default) (static/인스턴스) 메소드

    public void bell(){
        System.out.println("벨이 울립니다");
    }
    public void sendVoice(String message){
        System.out.println("자기 : "+message);
    }
    public void receiveVoice(String message){
        System.out.println("상대방 : "+message);
    }
    public void hangUp(){
        System.out.println("전화를 끊습니다");
    }
}
