package day15.step2;

public class SmartPhone extends Phone{ //부모의 기본 생성자가 존재하지않기때문에 오류
    SmartPhone(String owner){
        super(owner); //따라서 부모의 생성자 (String)에 맞는 super 부모생성자 호출

    }

    @Override
    void turnOn() {
        System.out.println("스마트폰의 전원을 켭니다");
    }


    void internetSearch(){
        System.out.println("인터넷 검색을 합니다");
    }
}
