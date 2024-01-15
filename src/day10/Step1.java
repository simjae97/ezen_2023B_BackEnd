package day10;
//클래스 사용목적: 1.라이브러리(설계도)클래스 2.실행 클래스

public class Step1 {
    public static void main(String[] args) {

        //1. 객체 생성
            //클래스명 변수명 = new 클래스명();

        캐릭터 user1 = new 캐릭터("자바맨");
        System.out.println(user1.닉네임);
        System.out.println(user1.레벨);
        System.out.println(user1.직업);
        System.out.println(user1.체력);
        캐릭터 user2 = new 캐릭터("클래스맨");
        System.out.println(user2.toString());

        //2.필드 사용
        user1.직업= "마법사";
        System.out.println(user1.직업);
        user2.직업="전사";
        System.out.println(user2.직업);

        //3.메소드 호출
        user2.공격();
        System.out.println(user2.체력);
        user1.공격();
        System.out.println(user1.체력);
    }
}
