package day11;

public class Step1 {
    public static void main(String[] args) {
        //객체 생성
        Korean k1 = new Korean("123456-1234567","김자바");
        day08.Korean k2 = new day08.Korean("심재훈","1234");
        //필드 호출
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);
        // 3.final 필드의 값 수정
        //k1.nation = "USA"; // final 초기화 이후 수정 불가
        //k1.ssn = "123455-1234567";
        k1.name = "박자바";
        System.out.println(Korean.EARTH_RADIUS);
        System.out.println(Korean.EART_SURFACE_AREA);
        System.out.println(k2.toString());

    }
}
