package 과제.팀과제1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("첫번째 값 입력");
            String 값1 = scanner.next();
            System.out.print("연산자 입력");
            String 연산자 = scanner.next();
            System.out.print("두번째 값 입력");
            String 값2 = scanner.next();
            try {
                Double.parseDouble(값1);
                Double.parseDouble(값2);
            } catch (NumberFormatException e) {
                System.out.println("값이 다릅니다");
                continue;
            }
            if(연산자.equals("+")){
                System.out.println(Integer.parseInt(값1)+Integer.parseInt(값2));
            }
            else if(연산자.equals("-")){
                System.out.println(Integer.parseInt(값1)-Integer.parseInt(값2));
            }
            else if(연산자.equals("*")){
                System.out.println(Integer.parseInt(값1)*Integer.parseInt(값2));
            }
            else if(연산자.equals("%")){
                System.out.println(Integer.parseInt(값1)%Integer.parseInt(값2));
            }
            else if(연산자.equals("/")){
                System.out.println(Integer.parseInt(값1)/Integer.parseInt(값2));
            }
            else if(연산자.equals("//")){
                System.out.println(Float.parseFloat(값1)/Float.parseFloat(값2));
            }
            else if(연산자.equals("^")){
                System.out.println(Integer.parseInt(값1)^Integer.parseInt(값2));
            }
            else if(연산자.equals("<<")){
                System.out.println(Integer.parseInt(값1)<<Integer.parseInt(값2));
            }
            else if(연산자.equals(">>")){
                System.out.println(Integer.parseInt(값1)>>Integer.parseInt(값2));
            }
            else if(연산자.equals("&")){
                System.out.println(Integer.parseInt(값1)&Integer.parseInt(값2));
            }
            else if(연산자.equals("|")){
                System.out.println(Integer.parseInt(값1)|Integer.parseInt(값2));
            }
            else {
                System.out.println("정의되지 않은 연산자입니다.");
            }
        }
    }
}
