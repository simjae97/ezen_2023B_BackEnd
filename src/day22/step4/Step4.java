package day22.step4;

import day22.Step3.Car;

public class Step4 {

    //제네릭 메소드 설명
    //<타입파라미터> : 함수 안에서 사용할 타입 파라미터
//    public static boolean boxing(String s){ 1.일반 메솓,
//        return false;
//    }
    //2.
    public static <T> boolean boxing3(String s){
        T t = null;
        System.out.println(t);
        return false;
    }
    public static <T> Box<T> boxing2(String s){
        Box<T> box = new Box<>();
        return box;
    }
    public static <T> Box<T> boxing(T t){
        Box<T> box = new Box<>();
        box.setT(t);
        return box;
    }
    //582p
    //제한된 파라미터를 가진 제네릭메소드
    public static <T extends Number> boolean compare(T t1, T t2){
        System.out.println("compaer("+t1.getClass().getSimpleName()+","+t2.getClass().getSimpleName()+")");

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        System.out.println(v1+""+v2);
        return (v1 == v2);
    }
    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int intvalue = box1.getT();
        Box<String> box2 = boxing("안녕하세요");
        String strValue = box2.getT();

        Box<Car> box = boxing(new Car());
        Car carValue = box.getT();

        System.out.println(intvalue+strValue);
        System.out.println(compare(1 , 2));
        System.out.println(compare(1.0 , 1));


    }

}
