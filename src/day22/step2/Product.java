package day22.step2;

public class Product <K,M>{
            //class 클래스명<제네릭타입1,제네릭타입2>
            //제네릭 타입명 : 임의로 가능하지만 주로 대문자 A~Z를 사용한다
    //1.필드
    private K kind;
    private M model;

    public K getKind() {return kind;}

    public void setKind(K kind) {this.kind = kind;}

    public M getModel() {return model;}

    public void setModel(M model) {this.model = model;}
}
