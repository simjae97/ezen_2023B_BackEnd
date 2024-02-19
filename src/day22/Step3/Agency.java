package day22.Step3;

public class Agency<P> implements Rentable<P> {
    private Class<P> type;

    public Agency(Class<P> type) {
        this.type = type;
    }

    @Override
    public P rent() {
        try {
            return type.newInstance(); // 또는 type.getDeclaredConstructor().newInstance()를 사용하여 비권장 메서드를 피할 수 있습니다.
        } catch (Exception e) {
            e.printStackTrace(); // 예외를 적절히 처리하십시오.
            return null;
        }
    }
}