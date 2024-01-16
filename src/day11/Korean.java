package day11;

public class Korean {
    //멤버
    //(정적/인스턴스)필드
        //1.인스턴스 final 필드
    //상수필드: 불변의 값
    // static final

    private String name2;
    static final double EARTH_RADIUS = 6400;
    static final double EART_SURFACE_AREA;
    //정적필드에서 상수 초기화
    static {
        EART_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS;
    }
    final String nation ="대한민국";
    final String ssn;
    String name;
    //생성자
    public Korean(String ssn, String name){
        this.ssn = ssn;
        this.name = name;
    }
    //(정적/인스턴스)메서드
}
