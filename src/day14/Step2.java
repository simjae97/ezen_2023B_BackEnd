package day14;

public class Step2 {


    public static void main(String[] args) {
        Parent parent =new Child();
        parent.method1();
        parent.method2();
        //parent.method3();

        System.out.println(parent.filed1);
        //System.out.println(parent.filed2); 부모타입에서 자식 필드 사용 불가
        Child child = (Child) parent;
        System.out.println(child.field2); //접근가능
        System.out.println(child.filed1);
    }
}
