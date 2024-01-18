package day13;

public class Step3 {
    public static void main(String[] args) {
        //자식 객체를 만들면 부모객체도 같이 만들어진다
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();

        //2.자식객체는 부모객체멤버를 사용할수 있다
        //단 자식객체가 부모객체 메소드를 재정의 했을경우에는 본인 객체가 우선을 갖는다

        //3.외부 클래스에서 상수 선언시 객체가 필요없다 (상수 아니면 필요함)
        //클래스명.스태틱 필드
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
