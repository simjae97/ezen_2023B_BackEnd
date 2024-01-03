package day01;

public class Step2 {

    public static void main(String[] args) {
        //p.37
        /*
        int value; //변수를 선언했지만 초기화를 하지 않았기 때문에 메모리할당이 되지않았음
        int result = value + 10; //초기값이 없는 변수를 호출했기 때문에 오류발생
        //java: variable value might not have been initialized

         */

        int value;
        value = 10;
        int result = value<<1;
        System.out.println(result);
    }
}
