package day22.step2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Step2 {
    public static void main(String[] args) {

        //1.product클레스에 tv타입, String 타입 정리
        Product<Tv,String> product1 = new Product<>();
        /*
            product1 객체의 필드 상태
            private Tv kind;
            private String model;
         */

        product1.setKind(new Tv());
        product1.setModel("스마트Tv");

        Tv tv = product1.getKind();
        String model = product1.getModel();

        Product<Car, String > product2 = new Product<>();
        //product2.setKind(new Product<>()); kind가 car이므로 안들어감
        product2.setKind(new Car());
        Car car = product2.getKind();
    }
}
