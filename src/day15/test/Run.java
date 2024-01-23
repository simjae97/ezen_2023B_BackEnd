package day15.test;

public class Run {
    public static void main(String[] args) {
        Child child= new Child();
        child.method1(); //오버라이딩된 method1 호출
        child.method2();
        Parent parent= new Parent();
        parent.method1();//오버라이딩 되지않은 method1 호출
        //parent.method2(); 못씀 -> 왜냐? 부모에는 method2가없음
        Parent child2 = new Child(); // 부모형태로 자동 형변환이 일어남
        child2.method1();//현재 부모형태이므로 부모안에 있는 method1만 사용 가능, method2는 사용 불가능, 하지만 method1의 경우 오버라이딩(재정의)했으므로 재정의된 내용으로 호출
        //child2.method2(); 못씀 -> 왜냐? 태생은 child이지만 현재 형변환이 되어 부모에는 method2가 없으므로
        Child child3 = (Child) child2; // 부모형태였던 child2를 Child형태로 강제 형변환
        //Child2 child4 = (Child2) child2; 못씀 -> 왜냐? 현재는 Parent이지만 태생이 Child이므로 Child와 Child2는 상속관계가 아니기때문에 형변환 불가능
        child3.method2(); //Child 형태로 다시 형변환 했으므로 사용 가능
    }
}
