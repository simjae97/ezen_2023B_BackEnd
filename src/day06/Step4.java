package day06;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력(숫자형식으로 입력받기):");
        String money = scanner.nextLine();
        String result = "";
        int first = money.length() % 3;
//        for(int j= first; j <money.length(); j+=4){ // ,값까지 해서 +4 앞에서 할경우:
//            money = money.substring(0,j)+","+money.substring(j);
//
//        }
        for (int i = 0; i<money.length(); i++){
            if(i>0 && i% 3 == first){
                result += ",";
            }
            result += money.charAt(i);
        }
//        for ( int i = money.length()-3; i>0; i -=3){ //뒤에서 세번째 자리수부터, 3자리주기이니 3자리마다 반복
//            money =money.substring(0,i)+","+money.substring(i); //0~i번째 문자열+','+i~끝문자열
//        }
        System.out.println("result = " + result);
        
    }
}
